package serealiz;

import java.awt.*;
import java.io.*;

public class ObjectReaderWriter {
  String filePath;

  public static void main( String args[] ) {
    ObjectReaderWriter orw = new ObjectReaderWriter();
  }

  ObjectReaderWriter() {
    try {
      MySerialObject serialObject = new MySerialObject();

      MyExternObject externObject = new MyExternObject();

      MyVersionObject versionObject = new MyVersionObject();

      //  Allow the user to specify an output file.
      FileDialog fd = new FileDialog( new Frame(), 
        "Save As...", FileDialog.SAVE );
      fd.show();
      filePath = new String( fd.getDirectory() + fd.getFile() );
  System.out.println("fd.getDirectory()="+fd.getDirectory());
  System.out.println("fd.getFile()="+fd.getFile());
  System.out.println("filePath="+filePath);
      //  Create a stream for writing.
      FileOutputStream fos = new FileOutputStream( filePath );

      //  Next, create an object that can write to that file.
      ObjectOutputStream outStream = 
        new ObjectOutputStream( fos );

      //  Save each object.
      outStream.writeObject( serialObject );

      externObject.writeExternal( outStream );

      outStream.writeObject( versionObject );

      //  Finally, we call the flush() method for our object, which           forces the data to 
      //  get written to the stream:
      outStream.flush();

      //  Allow the user to specify an input file.
      fd = new FileDialog( new Frame(), "Open...",
          FileDialog.LOAD );
      fd.show();
      filePath = new String( fd.getDirectory() + fd.getFile() );

      //  Create a stream for reading.
      FileInputStream fis = new FileInputStream( filePath );

      //  Next, create an object that can read from that file.
      ObjectInputStream inStream = new ObjectInputStream( fis );

      // Retrieve the Serializable object.
      serialObject = ( MySerialObject )inStream.readObject();

      //  Display what we retrieved:
      System.out.println( serialObject.getS() );
      System.out.println( "i = " + serialObject.getI() );
      serialObject.displayInternalObjectAttrs();

      // Retrieve the Externalizable object.
      externObject.readExternal( inStream );

      //  Display what we retrieved:
      System.out.println( externObject.getS() );
      System.out.println( "i = " + externObject.getI() );

      // Retrieve the versioned object.
      versionObject = ( MyVersionObject )
        inStream.readObject();
      //  Display what we retrieved:
      System.out.println( versionObject.getS() );
      System.out.println( "i = " + versionObject.getI() );

      // Display the SUID of the versioned class in the VM, 
      // not necessarily the serialized object.
      ObjectStreamClass myObject = ObjectStreamClass.lookup(
          Class.forName( "MyVersionObject" ) );
      long theSUID = myObject.getSerialVersionUID();

      System.out.println
        ( "The SUID of class MyVersionObject = " + theSUID );
    }
    catch ( InvalidClassException e ) {
      System.out.println( "InvalidClassException..." );
    }
    catch ( ClassNotFoundException e ) {
      System.out.println( "ClassNotFoundException..." );
    }
    catch ( OptionalDataException e ) {
      System.out.println( "OptionalDataException..." );
    }
    catch ( FileNotFoundException e ) {
      System.out.println( "FileNotFoundException..." );
    }
    catch ( IOException e ) {
      System.out.println( "IOException..." );
    }
  }
}
