package com.luigivismara.endpointregistry.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * EndPointDescription for use in controller methods
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EndPointDescription {
    /**
     * Store description
     * @return String value of description
     */
    String value();
}
