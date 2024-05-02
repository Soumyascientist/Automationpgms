package genericUtility;




import java.io.FileInputStream;
import java.util.Properties;




public class PropertyFileUtility {
	public String readdatafrompf(String key) throws Throwable {
		FileInputStream fisp=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\javaprogramings\\sowjanya\\swaglabs\\src\\test\\resources\\CD.properties");
		Properties p=new Properties();
		p.load(fisp);
		 return p.getProperty(key);

	}

}
	
	
	
	

