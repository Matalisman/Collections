
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc109
 */
public class SortObjectsByName implements Comparator<RandomObject>{
       @Override
        public int compare(RandomObject o1, RandomObject o2) {
            return o1.getName().compareTo(o2.getName());
	}   
}

