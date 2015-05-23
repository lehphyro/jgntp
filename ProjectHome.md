This project aims to implement GNTP as described [here](http://www.growlforwindows.com/gfw/help/gntp.aspx).

# Features #
  * Async I/O with [JBoss Netty](http://jboss.org/netty)
  * Registration with all supported attributes
  * Notification with all supported attributes
  * Password authentication
  * Request encryption (Growl for Windows doesn't support response encryption yet)
  * Click, close and timeout callbacks support
  * Custom and application specific headers
  * Automatic retry of registration and notification attempts
  * Available at Maven Central Repository

### Maven dependency declaration ###
```
<dependency>
    <groupId>com.google.code.jgntp</groupId>
    <artifactId>jgntp</artifactId>
    <version>1.2.1</version>
</dependency>
```

### How to use ###
Take a look at [GntpClientIntegrationTest](http://code.google.com/p/jgntp/source/browse/trunk/jgntp/src/test/java/com/google/code/jgntp/GntpClientIntegrationTest.java)

#### News ####
Version 1.2.1 fixes [issue 1](https://code.google.com/p/jgntp/issues/detail?id=1) about not receiving callbacks from Growl.