package internal.enl.malware.scantool.models.malshare.sample;
import internal.enl.malware.scantool.models.malshare.hashtypes.hashTypes;

import java.util.ArrayList;
import java.util.Collection;

public class Sample {
     // Input string.
     String hash;
     // enum
     private Collection<hashTypes> hashType;
     hashTypes hashType2nd; // i WOULD IMAGINE IS EQUAL GOOD?
     // should have some structure of data, not sure.
     // Please hold..
     String fileType;
     // Just the name, might flag something.
     String fileName;

     private Collection<hashTypes> x = new ArrayList<>();

     // Yes i know there are two hashTypes, its for testing.
     Sample(String hash, Collection<hashTypes>hashTypeGEN2, hashTypes hashType, String fileType, String fileName) {
         this.hash = hash;
         this.hashType = hashTypeGEN2;
         this.hashType2nd = hashType;
         this.fileType = fileType;
         this.fileName = fileName;
     }
     /*
     function getHash(String hash) {
         return hash;
     }*/
}
