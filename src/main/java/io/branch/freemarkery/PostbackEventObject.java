/**
 * Created by vatsal on 2019-04-26.
 */

package io.branch.freemarkery;

public class PostbackEventObject {

  String key;
  String name;

  public PostbackEventObject(String key, String name) {
    this.key = key;
    this.name = name;
  }

  public String getKey() {
    return key;
  }

  public String getName() {
    return name;
  }
}
