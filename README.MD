###### trello.csv

Locally running JAVA application which transforms JSON object retrieved from Trello. Extract cards and export to CSV format.

Single expected argument is source file path.
Execution example:

`java -jar trello.csv-1.0.jar "/Users/mczyzewski/Data/trello.json"`

Produces csv file with headers named 'Trello yyyy-MM-dd HH:mm:ss.csv'