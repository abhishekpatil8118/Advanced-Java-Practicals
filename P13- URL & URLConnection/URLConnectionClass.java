import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import  java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
public class URLConnectionClass 
{
    public static void main(String[] args) throws IOException , MalformedURLException
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Url: ");
        
        String web = scan.nextLine();
 
        URL url = new URL(web);
        URLConnection urlc = url.openConnection();
 
        System.out.println("Date:"+ new Date(urlc.getDate()) );
        System.out.println("Content Type: "+ urlc.getContentType());
        System.out.println("Content Length: "+urlc.getContentLength()); 
    }
}