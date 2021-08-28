package Assign.week3;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Launch the URL https://www.ajio.com/
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.ajio.com/");
		 
		 driver.close();
		 
	     	// 1. Launch the URL https://www.ajio.com/
		   // 2. In the search box, type as "bags" and press enter
			// 3. To the left  of the screen under " Gender" click the "Men"
			// 4. Under "Category" click "Fashion Bags"
			// 5. Print the count of the items Found. 
			// 6. Get the list of brand of the products displayed in the page and print the list.
			// 7. Get the list of names of the bags and print it
		 
		 }

	}


