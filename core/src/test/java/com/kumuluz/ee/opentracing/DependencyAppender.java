/*
 * Copyright (c) 2018 Sunesis, Ltd. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the contributor list.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.kumuluz.ee.opentracing;

import com.kumuluz.ee.testing.arquillian.spi.MavenDependencyAppender;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Adds required dependencies to the deployments.
 *
 * @author Urban Malc
 * @author Domen Jeric
 * @since 1.0.0
 */
public class DependencyAppender implements MavenDependencyAppender {

    private static final ResourceBundle versionsBundle = ResourceBundle.getBundle("META-INF/kumuluzee/opentracing/versions");

    @Override
    public List<String> addLibraries() {

        List<String> libs = new ArrayList<>();

        libs.add("com.kumuluz.ee:kumuluzee-jax-rs-jersey:");
        libs.add("com.kumuluz.ee:kumuluzee-cdi-weld:");
        libs.add("com.kumuluz.ee:kumuluzee-json-p-jsonp:");
        libs.add("io.opentracing:opentracing-util:"  +
                versionsBundle.getString("opentracing-version"));
        libs.add("io.opentracing:opentracing-api:" +
                versionsBundle.getString("opentracing-version"));
        libs.add("io.opentracing:opentracing-mock:" +
                versionsBundle.getString("opentracing-version"));
        libs.add("org.eclipse.microprofile.opentracing:microprofile-opentracing-api:" +
                versionsBundle.getString("microprofile-opentracing-version"));
        libs.add("com.kumuluz.ee.config:kumuluzee-config-mp:" +
                versionsBundle.getString("kumuluzee-config-mp.version"));
        libs.add("com.kumuluz.ee.rest-client:kumuluzee-rest-client:" +
                versionsBundle.getString("microprofile-rest-client-version"));
        libs.add("io.opentracing.contrib:opentracing-concurrent:" +
                versionsBundle.getString("opentracing-concurrent.version"));
        libs.add("javax.xml.bind:jaxb-api:" +
                versionsBundle.getString("jaxb-api.version"));

        return libs;
    }
}
