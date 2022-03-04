package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//root-context.xml을 대신하는 것임.
@ComponentScan(basePackages = {"org.zerock.sample"})
//basePackages에서 오타내지말것!!!!!

public class RootConfig {

}
