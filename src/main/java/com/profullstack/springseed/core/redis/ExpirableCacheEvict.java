package com.profullstack.springseed.core.redis;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExpirableCacheEvict {

	/**
	 * the cache name.
	 */
	String cacheName();

	/**
	 * the cache key.
	 */
	String key() default "";
}
