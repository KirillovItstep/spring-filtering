package org.itstep.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.search.annotations.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="users")
@Indexed(index = "idx_user")
public class User {
  @Id
  private Long id;

  @Field(store = Store.YES)
  @Field(name = "fullName")
  private String first;

  @Field(index = Index.NO, store = Store.YES)
  private String middle;

  @Field(store = Store.YES)
  @Field(name = "fullName")
  private String last;

  @Field
  private Integer age;

  @ContainedIn
  @OneToMany(mappedBy = "user")
  private List<Post> post;
}
