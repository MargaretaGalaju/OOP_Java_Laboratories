package OOP.lab3;

public class Main {
    public static void main(String[] args) {
        Text mytext = new Text();
                String text = "Hello, Dorin! This is my huge text for your lab. " +
                "Why?The move is likely part of a test by Facebook to see if they can boost " +
                "on-platform engagement, which has been on the decline in recent times." +
                " As per a report from The Information published back in April, sharing " +
                "of personal updates - like people's own thoughts and photos - fell" +
                " 21% between mid-2014 and mid-2015. This stat reportedly sparked" +
                "Zuck and Co. to put together a team to tackle this, with " +
                "staff assigned to come up with new ways to inspire" +
                "more personal sharing. This is also why you've seen an increase " +
                "in 'On This Day' reminders and notes about seasonal events, " +
                "little nudges to get you thinking about how you can stay in " +
                "touch and share information with your connections. And also Facebook.";


        System.out.println("Number of sentences in the text:" + mytext.countsentences(text));
        System.out.println("Number of words in the text:"+ mytext.countwords(text));

        System.out.println("Outputs text length:" + text.length());
        System.out.println("Outputs number of letters:" + mytext.countletters(text));
        mytext.countVowelsAndConsonants(text);
        mytext.countMostRepeatedWord(text);
        Text.longestWord(text);
        Text.top5Words(text);
    }

}