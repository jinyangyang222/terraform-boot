/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.terraform.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Main entry class to terraform-boot. This class can be directly executed to start the server.
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TerraformBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TerraformBootApplication.class, args);
    }

}
