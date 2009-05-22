package com.gaetests


import javax.jdo.annotations.*;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
class Book {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Key key

	@Persistent
	String title

	@Persistent
	Author author

    static constraints = {
    	key( nullable:true)
    	title( blank:false)
	}
}

