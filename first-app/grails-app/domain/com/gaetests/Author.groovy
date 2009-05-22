package com.gaetests



import javax.jdo.annotations.*;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
class Author {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Key key

	@Persistent
	String name

	@Persistent(mappedBy = "author")
	  List<Book> books = new ArrayList<Book>()

    static constraints = {
    	key( nullable:true)
    	name( blank:false)
	}
}

