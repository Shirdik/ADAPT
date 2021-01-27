import java.util.*;
class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "News [comment=" + comment + ", commentByUser=" + commentByUser + ", newsId=" + newsId
                + ", postedByUser=" + postedByUser + "]";
    }
    
}

public class Assignment5Q2 {

    public static int maxComments(ArrayList<News> news) {
        int max=0;
        for(News x: news)
        {
            if(max<x.getComment().length())
            max=x.getComment().length();
        }
        return max;
    }

    public static int budgetCount (ArrayList < News > news) {
        int max=0;
        for(News x: news)
        {
            if(x.getComment().contains("budget"))
            max++;
        }
        return max;
    }
    public static String maxCommentsByUser (ArrayList < News > news) {
        int maxi=0;
        String max="";
        for(News x: news)
        {
            if(maxi<x.getCommentByUser().length())
            {
                maxi=x.getCommentByUser().length();
                max=x.getCommentByUser();
            }
        }
        return max;
    }

    public static HashMap<String, Integer> sortMaxCommentsByUser (List < News > news) {
            HashMap<String, Integer> commentsByUserMap= new HashMap<>();
            Collections.sort(news,(o1,o2)->o1.getCommentByUser().length()>o2.getCommentByUser().length()?1:-1);
            for(News x: news)
            commentsByUserMap.put(x.getPostedByUser(),x.getCommentByUser().length());
            return commentsByUserMap;
    }

    public static void main(String[] args) {
        News n1= new News(1, "Shirdi", "Hello World!", "First News");
        News n2= new News(1, "Chandrika", "This is Chandrika", "Second News");
        News n3= new News(1, "Ganga", "This is Ganga", "Third News");
        News n4= new News(1, "Venkat", "THis is Venkat", "Fourth News");

        ArrayList<News> list= new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        
        System.out.println(sortMaxCommentsByUser(list));
        System.out.println(maxComments(list));
        System.out.println(budgetCount(list));
        System.out.println(maxCommentsByUser(list));


    }
}