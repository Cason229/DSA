/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author Acer
 */
import adt.SortedDoublyLinkedList;
import adt.SortedListInterface;
public class utility1 {
    public static String listToString(SortedListInterface<String> list) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < list.getSize(); i++) {
        sb.append(list.viewDataAtIndex(i));
        if (i < list.getSize() - 1) {
            sb.append(", ");
        }
    }
    return sb.toString();
}
}
