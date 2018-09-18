/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
import java.util.*;
public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rects = {new ComparableRectangle(1, 2),
            new ComparableRectangle(2, 3), new ComparableRectangle(3, 2),
            new ComparableRectangle(4, 3)};
        
        Arrays.sort(rects);
        
        for (ComparableRectangle rect : rects) {
            System.out.println(rect + " ");
        }
    }
}
