import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
    
	//API which takes care of bean creation
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	TextEditor obj = (TextEditor)context.getBean("textEditorbean1");
	obj.spellCheck();
	
	context.close();
}  
}  