package com.something.shah.quiz;



public class Questions {

    public String mQuestions[] = {
            "Who was the first to discover Gravity?",
            "WW2 was fought between ________",
            "Which is the National animal for The United States of America",
            "President Trump is our _______ president",
            "who is the current Vice President of the United States?",
            "What is the current tallest building in the world(as of April 2018)?",
            "what is the biggest continent in the world?",
            "Eart is the ______ planet in the solar system",
            "Who was the First presient of the United States",
            "what is the name of the currency used in england",
            "How many states are there in the United States?",
            "what is the most spoken language in the world?",
            "Mecca is the Holiest site in _______ religion",
    };

    private String mChoices[][] =

            {
                    { "Isaac Newton", "Galileo Galilei", "Albert Einstein", "Johannes kepler"},
                    { "Axis and Allies" , "East and West", "Europe and North America", "Nazis and Soviets" },
                    { "Cheeta", "bald eagle", "Wolf", "Lion"},
                    { "52nd", "49th", "45th", "38th"},
                    { "mike pence", "Barack Obama", "Joe Biden", "Hillary Clinton"},
                    { "Burj Khalifa", "Shanghai Tower", "One World Trade Center", "Willis Tower"},
                    { "Asia" , "Africa" , "North America" , "Antarctica"},
                    { "3rd" , "9th", "1st" , "5th"},
                    {"Thomas Jefferson", "George Washington", "James Madison", "benjamin franklin"},
                    {"Pound", "Dollar","Yen" , "Rupees"},
                    {"39", "60", "44" , "50"},
                    {"Mandarin", "Arabic", "English", "Spanish"},
                    {"Catholic", "Christian", "Islam", "Buddhism"},
            };
    private String mCorrectAnswers[]= {
            "Isaac Newton",
            "Axis and Allies" ,
            "bald eagle",
            "45th",
            "mike pence",
            "Burj Khalifa",
            "Asia",
            "3rd",
            "George Washington",
            "Pound",
            "50",
            "Mandarin",
            "Islam",
          };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = mChoices[a][0];
        return choice;

    }

    public String getchoice2(int a){
        String choice = mChoices[a][1];
        return choice;

    }
    public String getchoice3(int a){
        String choice = mChoices[a][2];
        return choice;

    }
    public String getchoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}

