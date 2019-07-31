package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean annotation demo.
 * musicPlayer component plays letItBeMusic bean
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // musicPlayer is a component defined in MusicPlayer.java
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // letItBeMusic is a been defined in AppConfig.java
        musicPlayer.play(context.getBean("letItBeMusic", Music.class));
        context.close();
    }
}
