/*
* File: DatabaseInterface.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/
 
package hu.library;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseInterface {

    Connection getConnection() throws SQLException;

}
