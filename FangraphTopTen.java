import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class FangraphTopTen {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList(
                "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&team=0&rost=0&age=0&filter=&players=0",
                "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&team=0&rost=0&age=0&filter=&players=0",
                "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&team=0&rost=0&age=0&filter=&players=0"
        );

        List<Map<String, String>> leadersList = new ArrayList<>();

        for (String url : urls) {
            try {
                Document doc = Jsoup.connect(url).get();
                Elements rows = doc.select("table#LeaderBoard1_dg1 > tbody > tr:gt(0)");

                Map<String, String> leaders = new LinkedHashMap<>();
                for (Element row : rows) {
                    Elements cols = row.select("td");
                    String name = cols.get(1).text();
                    String value = cols.get(2).text();
                    leaders.put(name, value);
                }

                leadersList.add(leaders);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < leadersList.size(); i++) {
            Map<String, String> leaders = leadersList.get(i);
            System.out.println("Leaders for " + (2022 - i) + ":");
            printTopTen();
            System.out.println();
        }

        Map<String, Double> combinedLeaders = new HashMap<>();
        for (Map<String, String> leaders : leadersList) {
            for (Map.Entry<String, String> entry : leaders.entrySet()) {
                String name = entry.getKey();
                double value = Double.parseDouble(entry.getValue());
                if (combinedLeaders.containsKey(name)) {
                    combinedLeaders.put(name, combinedLeaders.get(name) + value);
                } else {
                    combinedLeaders.put(name, value);
                }
            }
        }

        List<Map.Entry<String, Double>> sortedLeaders = new ArrayList<>(combinedLeaders.entrySet());
        sortedLeaders.sort(Map.Entry.<String, Double>comparingByValue().reversed());
        System.out.println("Top ten players for all three years:");
        printTopTen();
    }

	private static void printTopTen() {
		// TODO Auto-generated method stub
		
	}
}