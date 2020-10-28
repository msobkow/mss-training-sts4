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
