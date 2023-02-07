package main;

import objects.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        ArrayList<Editor> editors = new ArrayList<>();
        //Adding one editor and a couple of articles to test
        editors.add(new Editor("marçal","36576455s"));
        editors.get(0).getNewsList()
                .add(new Football("ferran torres decepciona!","la liga","barça","ferran torres"));
        editors.get(0).getNewsList()
                .add(new Football("hat trick de gabi a europa!","champions league","barça","gabi"));

        do {
            switch (menu()) {
                case 1:
                    insertEditor(editors);
                    break;
                case 2:
                    deleteEditor(editors);
                    break;
                case 3:
                    insertNewsArticleToEditor(editors);
                    break;
                case 4:
                    deleteNewsArticleFromEditor(editors);
                    break;
                case 5:
                    showAllNewsArticlesFromAnEditor(editors);
                    break;
                case 6:
                    showPointsForAnArticle(editors);
                    break;
                case 7:
                    showPriceForAnArticle(editors);
                    break;
                case 0:
                    System.out.println("Thank you for using this app!");
                    exit = true;
                    break;
            }
        } while (!exit);

    }//closes main

    private static void showPriceForAnArticle(ArrayList<Editor> editors) {
        int pos = searchEditor(editors);
        if (pos!=-1){
            ArrayList<News> newsList = editors.get(pos).getNewsList();
            System.out.println("***List of news articles***");
            for (News n:newsList) {
                System.out.println("Title: "+n.getTitle() +" - Rate: " + n.getPrice());
            }
        }else{
            System.out.println("Editor not found in our database!");
        }
    }

    private static void showPointsForAnArticle(ArrayList<Editor> editors) {

        int pos = searchEditor(editors);
        if (pos!=-1){
            ArrayList<News> newsList = editors.get(pos).getNewsList();
            System.out.println("***List of news articles***");
            for (News n:newsList) {
                System.out.println("Title: "+n.getTitle() +" - Rate: " + n.getRate());
            }
        }else{
            System.out.println("Editor not found in our database!");
        }

    }

    private static void showAllNewsArticlesFromAnEditor(ArrayList<Editor> editors) {

        int pos = searchEditor(editors);

        if (pos!=-1){
            ArrayList<News> newsList = editors.get(pos).getNewsList();
            System.out.println("***List of news articles***");
            for (News n:newsList) {
                System.out.println("Title: "+n.getTitle());
            }
        }else{
            System.out.println("Editor not found in our database!");
        }
    }

    private static void deleteNewsArticleFromEditor(ArrayList<Editor> editors) {
        int pos = searchEditor(editors);
        int userChoice=0;
        Scanner sc = new Scanner(System.in);

        if (pos !=-1){
            ArrayList<News> newsList = editors.get(pos).getNewsList();
            System.out.println("***List of Articles***");
            for (int i =0; i < newsList.size();i++) {
                System.out.println(i+1 +" - Article title: "+ newsList.get(i).getTitle());
            }

            System.out.println("Type in the number of the article you want to delete.");
            userChoice = sc.nextInt();
            if (userChoice >= 1 && userChoice <= newsList.size()){
                newsList.remove(userChoice-1);
                System.out.println("Article deleted  from database");
            }else{
                System.out.println("Article number not valid!");
            }
        }else{
            System.out.println("Error! Editor not found in the database");
        }
    }

    private static void insertNewsArticleToEditor(ArrayList<Editor> editors) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;

        System.out.println("Type in the number of the type of article you want to insert:");
        System.out.println("1.Football\n2.Basketball\n3.Tennis\n4.F1\n5.MotoGP");
        int newsType = sc.nextInt();

        switch(newsType){
            case 1:
                Football footballArticle = createFootballArticle();
                pos = searchEditor(editors);
                    if (pos!=-1){
                        editors.get(pos).getNewsList().add(footballArticle);
                        System.out.println("News article inserted in the database!");
                    }else{
                        System.out.println("Error! Editor not found in the database!");
                    }
                break;
            case 2:
                Basketball basketballArticle = createBasketballArticle();
                pos = searchEditor(editors);
                if (pos!=-1){
                    editors.get(pos).getNewsList().add(basketballArticle);
                    System.out.println("News article inserted in the database!");
                }else{
                    System.out.println("Error! Editor not found in the database!");
                }
                break;
            case 3:
                Tennis tennisArticle = createTennisArticle();
                pos = searchEditor(editors);
                if (pos!=-1){
                    editors.get(pos).getNewsList().add(tennisArticle);
                    System.out.println("News article inserted in the database!");
                }else{
                    System.out.println("Error! Editor not found in the database!");
                }
                break;
            case 4:
                F1 f1Article = createf1Article();
                pos = searchEditor(editors);
                if (pos!=-1){
                    editors.get(pos).getNewsList().add(f1Article);
                    System.out.println("News article inserted in the database!");
                }else{
                    System.out.println("Error! Editor not found in the database!");
                }
                break;
            case 5:
                MotoGP motoGPArticle = createMotoGPArticle();
                pos = searchEditor(editors);
                if (pos!=-1){
                    editors.get(pos).getNewsList().add(motoGPArticle);
                    System.out.println("News article inserted in the database!");
                }else{
                    System.out.println("Error! Editor not found in the database!");
                }
                break;
            default:
                System.out.println("you did not selected a valid type!");
        }


    }

    private static MotoGP createMotoGPArticle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the article's title");
        String articleTitle = sc.nextLine();

        System.out.println("Type in the team's name the article talks about");
        String articleTeamName = sc.nextLine();

        return new MotoGP(articleTitle,articleTeamName);
    }

    private static F1 createf1Article() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the article's title");
        String articleTitle = sc.nextLine();

        System.out.println("Type in the scuderia's name the article talks about");
        String articleScuderia = sc.nextLine();

        return new F1(articleTitle,articleScuderia);
    }

    private static Tennis createTennisArticle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the article's title");
        String articleTitle = sc.nextLine();

        System.out.println("Type in the competition's name the article talks about");
        String articleCompetition = sc.nextLine();

        System.out.println("Type in the player's name the article talks about");
        String articlePlayerName = sc.nextLine();

        return new Tennis(articleTitle,articleCompetition,articlePlayerName);
    }

    private static Basketball createBasketballArticle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the article's title");
        String articleTitle = sc.nextLine();

        System.out.println("Type in the competition's name the article talks about");
        String articleCompetition = sc.nextLine();

        System.out.println("Type in the club's name the article talks about");
        String articleClub = sc.nextLine();

        return new Basketball(articleTitle,articleCompetition,articleClub);
    }

    private static Football createFootballArticle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the article's title");
        String articleTitle = sc.nextLine();

        System.out.println("Type in the competition's name the article talks about");
        String articleCompetition = sc.nextLine();

        System.out.println("Type in the club's name the article talks about");
        String articleClub = sc.nextLine();

        System.out.println("Type in the player's name the article talks about");
        String articlePlayerName = sc.nextLine();

        return new Football(articleTitle,articleCompetition,articleClub,articlePlayerName);
    }

    private static boolean deleteEditor(ArrayList<Editor> editors) {
        boolean eliminated = false;

        int pos = searchEditor(editors);

        if (pos !=-1){
            editors.remove(pos);
            eliminated=true;
            System.out.println("Editor eliminated from database!");
        }else{
            eliminated=false;
            System.out.println("Error! Editor not eliminated from database!");
        }
        return eliminated;
    }

    private static boolean insertEditor(ArrayList<Editor> editors) {
        boolean inserted = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the name of the Editor");
        String editorName = sc.next();
        System.out.println("Type in the DNI of the Editor");
        String editorDNI = sc.next();

        if (editorName !=null && editorDNI !=null){
            editors.add(new Editor(editorName,editorDNI));
            System.out.println("Editor inserted in the database!");
            inserted=true;
        }else{
            System.out.println("Error! Editor not inserted in the database.");
            inserted=false;
        }

        return inserted;
    }

    private static int searchEditor(ArrayList<Editor> editors){
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = editors.size();
        int pos = 0;

        System.out.println("Type in the name of the Editor");
        String editorName = sc.next();
        System.out.println("Type in the DNI of the Editor");
        String editorDNI = sc.next();

        while(found==false && i < j){
            if (editors.get(i).getName().equalsIgnoreCase(editorName) &&
                    editors.get(i).getDNI().equalsIgnoreCase(editorDNI)){
                found=true;
                pos = i;
            }
            i++;
        }

        if (!found){pos=-1;}

        return pos;
    }

    public static byte menu(){
        Scanner sc = new Scanner(System.in);
        byte userOption;
        final byte MINIMUM = 0;
        final byte MAXIMUM = 8;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Insert Editor");
            System.out.println("2. Delete Editor");
            System.out.println("3. Insert news to an Editor");
            System.out.println("4. Delete news from an Editor");
            System.out.println("5. Show all news from an Editor");
            System.out.println("6. Calculate points from a news article");
            System.out.println("7. Calculate price from a news article");
            System.out.println("0. Exit the app.\n");
            userOption = sc.nextByte();
            if (userOption < MINIMUM || userOption > MAXIMUM) {
                System.out.println("Choose a valid option");
            }
        } while (userOption < MINIMUM || userOption > MAXIMUM);

        return userOption;
    }

}//Closes class