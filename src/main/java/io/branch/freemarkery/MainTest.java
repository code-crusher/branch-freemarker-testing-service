/**
 * Created by vatsal on 2019-04-26.
 */

package io.branch.freemarkery;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Instant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Date;

public class MainTest {

  public static void main(String[] args) throws Exception {
    Configuration cfg = new Configuration();

    // tutorial: https://www.vogella.com/tutorials/FreeMarker/article.html
    //cfg.setClassForTemplateLoading(MainTest.class, "templates");
    //Date date = Date.from( Instant.ofEpochSecond(Long.parseLong("1556162150")) );
    cfg.setIncompatibleImprovements(new Version(2, 3, 20));
    cfg.setDefaultEncoding("UTF-8");
    cfg.setLocale(Locale.US);
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

    Map<String, Object> input = new HashMap<String, Object>();
    input.put("name", "INSTALL");
    input.put("install_datetime", "2019-04-25 03:15:50");
    input.put("click_timestamp", "15561620540");
    input.put("country_code", "CO");
    input.put("user_id", "1b4d8689-c932-4e1b-b6b9-8152be8c0379");
    input.put("mobile_app_type", "ANDROID");
    input.put("device_model", "SM-G610M");
    input.put("site_name", "Uber (Android)");
    input.put("event_name", "INSTALL");
    input.put("publisher_name", "");
    input.put("sub_ad_ref", "");
    input.put("sub_adgroup_ref", "");
    input.put("sub_campaign_name", "");
    input.put("sub_campaign_ref", "");
    input.put("agency_id", "");
    input.put("advertiser_ref_id", "");
    input.put("transaction_id", "8e85e4c9-1df6-4f61-8ccb-bf003daf17df");
    input.put("event_timestamp", "0000");
    input.put("ios_ifa", "");
    input.put("device_ip", "186.28.206.70");
    input.put("google_aid", new String("4813fc2e-8027-4c2b-a8b9-116ffe5c8971").toUpperCase());

    Template template = cfg
        .getTemplate("src/main/java/io/branch/freemarkery/templates/uber-orion.ftl");

    Writer consoleWriter = new OutputStreamWriter(System.out);
    template.process(input, consoleWriter);

    // For the sake of example, also write output into a file:
//    Writer fileWriter = new FileWriter(new File("output.txt"));
//    try {
//      template.process(input, fileWriter);
//    } finally {
//      fileWriter.close();
//    }
  }
}
