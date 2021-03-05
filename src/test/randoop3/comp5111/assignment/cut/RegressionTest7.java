package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ", pattern1, " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  " + "'", str3, "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, (int) (short) -1, (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 478, 37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        char[] charArray3 = new char[] { '#' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n  \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r \r \r   \n \r\n ", pattern1, " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r \r   \n \r\n ", "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n " + "'", str3, "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", pattern1, "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n  \r \r   \n \r\n     \n  \r \n ", "\n \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n \r\n ", "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        float[] floatArray1 = new float[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (-444));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        char[] charArray10 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \n ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 89 + "'", int18 == 89);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 53, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int[] intArray6 = new int[] { 12, (short) 1, '\000', 22, 0, 107 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[12, 1, 0, 22, 0, 107]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) (short) 0, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 137 + "'", int1 == 137);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h  i  !     ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \r\n ", "\r", "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! \n " + "'", str3, "\n hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! \n ");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r        \n ", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r        \n ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r \r \r ", pattern1, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \n,  , \n,  , \n, \r, \n,  , \n,  , \n,  , \n, \n, \n,  , \n,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  ,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r, \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r        \n ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", "\n hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! \n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \r h \r i \r ! \r   \r ", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h  i  !     ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ", true, 36, (java.lang.CharSequence) "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (-113), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        char[] charArray15 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray15);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray15);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray15);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", charArray15);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray15);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray15);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", charArray15);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (java.lang.CharSequence) "  \r \r        \n ", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r ", false, 7, charSequence3, 556, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h  i  !     ", 6, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        long[] longArray6 = new long[] { (short) 0, '\n', (byte) 0, '#', (byte) -1, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 10, 0, 35, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "", "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n        \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n        \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", "       \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! " + "'", str3, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", true, (int) (byte) 10, (java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", (-9), 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n        \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "       \n ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", " \r ", "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", " \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 254 + "'", int3 == 254);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r ", (java.lang.CharSequence) "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", false, 256, (java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", (-22), 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 444, 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "    \r       \r     \r \r  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n \r ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        short[] shortArray1 = new short[] { (short) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        java.lang.Class<?> wildcardClass6 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "   \r   ", "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n    \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n " + "'", str3, "   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n    \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n \r   \n\n\r   \n \r\n    \n\n\r   \n \r\n \n \r\n  \r \n ");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (-36), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "    \r    \n  \r \n ", "\n hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n  \r \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (-6), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n        \r       \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!  \r \n    hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi!    \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! \r\n   \r   hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  ,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", 39, 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n ", " \r h \r i \r ! \r   \r ", "\n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        short[] shortArray1 = new short[] { (short) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-1), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }
}

