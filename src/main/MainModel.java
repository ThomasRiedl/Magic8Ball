package main;

import java.util.ArrayList;
import java.util.Random;

public class MainModel {
    private ArrayList<String> positiveanswers = new ArrayList<>();
    private ArrayList<String> neutralanswers = new ArrayList<>();
    private ArrayList<String> negativanswers = new ArrayList<>();

    public MainModel()
    {
        positiveanswers.add("It is certain.");
        positiveanswers.add("It is decidedly so.");
        positiveanswers.add("Without a doubt.");
        positiveanswers.add("Yes – definitely.");
        positiveanswers.add("You may rely on it.");
        positiveanswers.add("As I see it, yes.");
        positiveanswers.add("Most likely.");
        positiveanswers.add("Outlook good.");
        positiveanswers.add("Yes.");
        positiveanswers.add("Signs point to yes.");
        neutralanswers.add("Reply hazy, try again");
        neutralanswers.add("Ask again later.");
        neutralanswers.add("Better not tell you now.");
        neutralanswers.add("Cannot predict now.");
        neutralanswers.add("Concentrate and ask again.");
        negativanswers.add("Don’t count on it.");
        negativanswers.add("My reply is no.");
        negativanswers.add("My sources say no.");
        negativanswers.add("Outlook not so good.");
        negativanswers.add("Very doubtful.");
    }

    public String specialanswers (String a)
    {
        Random r = new Random();

        if(a.contains("Softwareentwicklung"))
        {
            return positiveanswers.get(r.nextInt(positiveanswers.size()));
        }

        else if(a.contains("SEW"))
        {
            return positiveanswers.get(r.nextInt(positiveanswers.size()));
        }

        else if(a.contains("food"))
        {
            return positiveanswers.get(r.nextInt(positiveanswers.size()));
        }

        else if(a.contains("should"))
        {
            return positiveanswers.get(r.nextInt(positiveanswers.size()));
        }

        else if(a.contains("maths"))
        {
            return positiveanswers.get(r.nextInt(negativanswers.size()));
        }
        return a;
    }
}
