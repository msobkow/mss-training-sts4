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

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Configuration
@EnableConfigurationProperties(Sts4TrainingConfig.class)
@PropertySource("classpath:sts4training.properties")
@ConfigurationProperties(prefix="sts4training")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Sts4TrainingConfig {
	@Getter
	@Setter
    @NotNull
    @Size(min = 8, max = 2048)
    private String defaultDir;
    
	@Getter
	@Setter
    @NotNull
    @Size(min = 8, max = 2048)
    private String searchDir;
    
	@Getter
	@Setter
    @Size(min = 0, max = 2048)
    private String searchDir1;
    
	@Getter
	@Setter
    @Size(min = 0, max = 2048)
    private String searchDir2;
    
	@Getter
	@Setter
    @Size(min = 0, max = 2048)
    private String searchDir3;
}
