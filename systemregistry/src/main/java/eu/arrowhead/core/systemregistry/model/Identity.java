/*
 * This work is part of the Productive 4.0 innovation project, which receives grants from the
 * European Commissions H2020 research and innovation programme, ECSEL Joint Undertaking
 * (project no. 737459), the free state of Saxony, the German Federal Ministry of Education and
 * national funding authorities from involved countries.
 */

package eu.arrowhead.core.systemregistry.model;

public class Identity implements Comparable<Identity> {

  protected String id;

  public Identity() {

  }

  public Identity(String id) {
    this.id = id;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public int compareTo(Identity o) {
    // TODO Auto-generated method stub
    return 0;
  }
}