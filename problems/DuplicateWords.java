/*
 * Find the duplicate words from a stream of works
 *
 */

package SteamAnalysis;

import java.util.HashSet; 

public class DuplicateWords {

	public HashSet Set_All_Words; 
	public HashSet Set_Duplicate_Words; 

	Duplicate() {

		Set_All_Words = new HashSet<String>();
		Set_Set_Duplicate_Words = new HashSet<String>();
	}

	void findDuplicateWords(InputStream s) {

		String buffer;
		
		while ((buffer = s.read()) != null) {			

			if (Set_Duplicate_Words.contains(temp)) {

				continue;
			}
			
			if (Set_All_Words.contains(temp)) {

				Set_All_Words.remove(temp);
				Set_Duplicate_Words.add(temp);

			} else {

				Set_All_Words.add(temp);
			}
		}
	}
}