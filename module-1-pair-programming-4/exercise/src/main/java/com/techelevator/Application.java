package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;


import java.util.List;

public class Application {

    public static void main(String[] args) {

        try {

            // Step Two: Create TELog, and log the start of the application.
            // log the message: "Search application started"
            TELog.log("Search application started");


            // Step Four: Instantiate a Search Domain
            SearchDomain searchDomain = new SearchDomain("exercise/data");
            TELog.log("index" + searchDomain.toString());

/* Searching a single and multi word within five different files and then logging every instance of the search.
 output the lines of the files of where the word was found. Logs the instance in the log file.
 */
            // Step Six: Single word search
            //
            SearchEngine search = new SearchEngine(searchDomain);
            search.indexFiles();
            List<String> foundInFiles = search.search("squirrel");
            if (foundInFiles.size() > 0) {
                for (String file : foundInFiles) {
                    System.out.println(file);
                }
            } else {
                System.out.println("The search term does not appear in any of the indexed files.");
            }

            // Step Seven: Multiple word search
            //
            SearchEngine call = new SearchEngine(searchDomain);
            call.indexFiles();
            List<String> multiSearch = call.search("telephone line");
            if (multiSearch.size() > 0) {
                for (String file : multiSearch) {
                    System.out.println(file);
                }
            } else {
                System.out.println("That search term does not appear in the indexed files.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
