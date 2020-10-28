package org.msscf.sts4training.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	private static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(Application.class, args);
		String[] configurations = applicationContext.getBeanNamesForType( Sts4TrainingConfig.class );
		if( configurations.length <= 0 ) {
			System.out.println( "MssCFeConfiguration instances have not been registered as application context beans" );
		}
		else {
			Sts4TrainingConfig bean;
			for( String beanName : configurations ) {
				System.out.println( "StsTrainingConfigur is available as bean \"" + beanName + "\"" );
				bean = applicationContext.getBean( beanName, Sts4TrainingConfig.class );
				if( bean != null ) {
					System.out.println( "The Sts4TrainingConfig bean named \"" + beanName + "\" has the following attributes:" );
					System.out.println( "    bean.tostring=" + bean.toString() );
	                System.out.println( "    defaultDir=" + ( ( bean.getDefaultDir() == null ) ? "null" : "\"" + bean.getDefaultDir() + "\"" ) );
	                System.out.println( "    searchDir=" + ( ( bean.getSearchDir() == null ) ? "null" : "\"" + bean.getSearchDir() + "\"" ) );
	                System.out.println( "    searchDir1=" + ( ( bean.getSearchDir1() == null ) ? "null" : "\"" + bean.getSearchDir1() + "\"" ) );
	                System.out.println( "    searchDir2=" + ( ( bean.getSearchDir2() == null ) ? "null" : "\"" + bean.getSearchDir2() + "\"" ) );
	                System.out.println( "    searchDir3=" + ( ( bean.getSearchDir3() == null ) ? "null" : "\"" + bean.getSearchDir3() + "\"" ) );
				}
				else {
					System.out.println( "Bizarre - the bean named \"" + beanName + "\" is null" );
				}
			}
		}
	}

}
