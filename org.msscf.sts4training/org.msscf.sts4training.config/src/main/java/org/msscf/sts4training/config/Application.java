/**
 *	Mark Stephen Sobkow's Training Projects for Spring Tool Suite 4 features needed for MssCFe
 *
 *	WARNING: This is NOT a training guide to show you how to use Spring 4.
 *	Rather, it is my personal playground for learning how to work with
 *	various Spring 4 technologies I'll need for my own
 *	MSS Code Forge Environment project (MssCFe.)
 *
 *		Copyright 2020 Mark Stephen Sobkow
 *
 *		Licensed under the Apache License, Version 2.0 (the "License");
 *		you may not use this file except in compliance with the License.
 *		You may obtain a copy of the License at
 *
 *		    http://www.apache.org/licenses/LICENSE-2.0
 *
 *		Unless required by applicable law or agreed to in writing, software
 *		distributed under the License is distributed on an "AS IS" BASIS,
 *		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *		See the License for the specific language governing permissions and
 *		limitations under the License.
 */
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
