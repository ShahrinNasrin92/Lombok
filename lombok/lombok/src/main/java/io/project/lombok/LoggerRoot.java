package io.project.lombok;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.*;
@Slf4j
class LoggerRoot {
//public class LoggerRoot final Logger log=LoggerFactory.getLogger(LoggerRoot.class);
public static void main(String[] args) {
	IntStream.rangeClosed(1, 10).forEach( counter ->{
		log.info("Counter : " +counter);
	});
	
}
}
