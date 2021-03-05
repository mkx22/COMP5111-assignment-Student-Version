package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\r\r\n\r\n\r", pattern1, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", (java.lang.CharSequence) "hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n   ", pattern1, "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n   " + "'", str3, "   \n   ");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\nhi!hi!", false, 233, (java.lang.CharSequence) "hi!hi!\nhi!hi!", 150, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ,  , \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  , h, \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ,  , \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  , i, \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ,  , \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  , !, \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  , h, \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ,  , \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  , i, \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ,  , \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  , !, \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ,  , \r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   h i !   h i ! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  , h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", true, (-94), (java.lang.CharSequence) "hi!hi!\nhi!hi!", 100, 116);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !h i ! ", " h i !   h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !h i ! " + "'", str3, " h i !h i ! ");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !   h i ! ", "   \n   ", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i ! " + "'", str3, " h i !   h i ! ");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n       \n   \n\n", pattern1, "     h     i     !           h     i     !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n       \n   \n\n" + "'", str3, "\n   \n       \n   \n\n");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi! hi!\n", "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 103, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, (-22), (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", 233, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!hi!hi!", false, 48, (java.lang.CharSequence) "hi!", 48, 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" h i !h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  h i !h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" h i !   h i ! ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n   \n       \n   \n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n   \n       \n   \n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  ,  ,  , \n,  ,  ,  ,  ,  ,  ,  , \n,  ,  ,  , \n, \n]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi! hi!\n\n", "   \n   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", (java.lang.CharSequence) "   \n   ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) " ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 47, (java.lang.CharSequence) "hi!hi! hi!hi!", (-3), (-10));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", "hi!hi!hi!hi!", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray15);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray15);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 51, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence5, charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r   h i ! ", charArray15);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray15);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray15);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (int) ' ', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", pattern1, "\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", (java.lang.CharSequence) "hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n", (java.lang.CharSequence) " ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !   h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !,  , h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n   \n       \n   \n\n", "hi! hi!\n\n hi!\n\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n", "\nhi! hi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 103, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n hi! hi!\n\n\n", "hi!hi! hi!hi!", "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n hi! hi!\n\n\n" + "'", str3, "hi! hi!\n hi! hi!\n\n\n");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", false, 0, (java.lang.CharSequence) "hi!hi!hi!hi!", 21, (-15));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" h i !h i ! ", " \r   h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence4, charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n       \n   \n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        float[] floatArray4 = new float[] { 51, 9, 14, '\000' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[51.0, 9.0, 14.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", (java.lang.CharSequence) "     h     i     !           h     i     !     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n\nhi!\n\n", "  ", "\rhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", 100, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n", (int) '\000', 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "hi!hi! hi!", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n" + "'", str3, "\n\n");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!hi!hi!", "\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\n hi! hi!\n\n\n", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "  ", "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "hi! hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   ", pattern1, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n", 12, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 294 + "'", int1 == 294);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n hi! hi!\n\n\n", "\r\nhi! hi!\n\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n hi! hi!\n\n\n" + "'", str3, "hi! hi!\n hi! hi!\n\n\n");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "   \n   ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i !   h i ! ", (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", "\rhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        boolean[] booleanArray3 = new boolean[] { false, false, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   ", false, (-9), (java.lang.CharSequence) "\n\r\n", 150, 233);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n", "hi!", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n" + "'", str3, "\n\n");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r\r\n\r\n\r", "", "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n   \n       \n   \n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?   ?       ?   ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi! hi!\n\n", pattern1, "\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi! hi!\n\n" + "'", str3, "\r\nhi! hi!\n\n");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String[] strArray3 = new java.lang.String[] { "\r", "\n\n", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 233);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!", pattern1, "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!" + "'", str3, "hi! hi!");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", 9, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\n", pattern1, "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray14);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray14);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray14);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray14);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!", 19, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray14);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!", charArray14);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!", pattern1, " \r   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!" + "'", str3, "\r hi!");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charSequence1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray15);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n", charArray15);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        boolean[] booleanArray5 = new boolean[] { false, true, true, false, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\n", pattern1, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 19, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 0, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  ", pattern1, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", 294);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n\n hi!\n\n", "hi! hi!\n\n hi!\n\n", "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi! hi!" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n   ", (java.lang.CharSequence) "   \n   ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        long[] longArray2 = new long[] { (-91), 19 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-91, 19]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) " h i !   h i ! ", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        java.lang.Class<?> wildcardClass22 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", pattern1, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n\n hi!\n\n\r\n", "hi!hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n\r\n" + "'", str3, "hi! hi!\n\n hi!\n\n\r\n");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n\n hi!\n\n\r\n", "hi!hi! hi!hi!", "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n\r\n" + "'", str3, "hi! hi!\n\n hi!\n\n\r\n");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n   ", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n   " + "'", str3, "   \n   ");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r   h i ! ", 150, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        long[] longArray2 = new long[] { 16, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass9 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[16, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   h i !   h i ! ", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   ", 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !   h i ! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        char[] charArray9 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\r\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", 19, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray16 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray16);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray16);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n", charArray16);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray16);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n   \n       \n   \n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \n, \r, \n, \r, h,  , i,  , !, \r, \n, \r, \n, \r, h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!", pattern1, "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!" + "'", str3, "hi!hi! hi!");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!", pattern1, "     h     i     !           h     i     !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) " h i !h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        short[] shortArray6 = new short[] { (short) -1, (short) 0, (byte) 100, (byte) 100, (short) 1, (byte) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 0, 100, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   h i !   h i ! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?h? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?i? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?!? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ? ? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?h? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?i? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?!? h i !h i ! ? h i !h i ! ?? h i !h i ! ? h i !h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r   h i ! ", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi! hi!", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\r", "     h     i     !           h     i     !     ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) "   ", 207);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n\n hi!\n\n\r\n", "hi!hi!\nhi!hi!", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n\r\n" + "'", str3, "hi! hi!\n\n hi!\n\n\r\n");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray14);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray14);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n   ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   h i !   h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n hi!\n\n", " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        short[] shortArray5 = new short[] { (byte) 10, (short) 100, (short) 10, (short) 0, (byte) 100 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "     h     i     !           h     i     !     ", 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!", "hi!hi!hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!", pattern1, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!" + "'", str3, "hi! hi!");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n\n", (-15), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", (java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", 103, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!?????h i !?????h i !  ?????h i !?????h i ! h?????h i !?????h i !  ?????h i !?????h i ! i?????h i !?????h i !  ?????h i !?????h i ! !?????h i !?????h i ! h?????h i !?????h i !  ?????h i !?????h i ! i?????h i !?????h i !  ?????h i !?????h i ! !?????h i !?????h i !  ?????h i !?????h i ! hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        long[] longArray3 = new long[] { 100L, (-3), (short) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, -3, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        short[] shortArray5 = new short[] { (byte) 0, (short) 100, (byte) 10, (short) 1, (short) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        java.lang.Class<?> wildcardClass14 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 100, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n", (-15));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n   \n       \n   \n\n", (java.lang.CharSequence) "hi! hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r   h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", pattern1, " \r   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   h i !   h i ! ", 5, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\nhi!hi!", "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n\n", 0, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "     h     i     !           h     i     !     ", false, 72, (java.lang.CharSequence) "   h i !   h i ! ", (int) (short) -1, (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", "   \n   ", "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " h i !h i ! ", false, 94, (java.lang.CharSequence) "\r\nhi! hi!\n\n", 51, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rhi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double[] doubleArray5 = new double[] { (-6), 10.0f, 3, (byte) 100, '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-6.0, 10.0, 3.0, 100.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!", pattern1, "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        java.lang.Class<?> wildcardClass6 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n       \n   \n\n", "\n   \n       \n   \n\n", "hi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        long[] longArray2 = new long[] { 16, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        java.lang.Class<?> wildcardClass8 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[16, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 3, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \n, \n, h, i, !, \n, \n]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\r hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i !   h i ! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r   h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi! hi!\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r", 1, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\r\nhi! hi!\n\n", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", true, 15, (java.lang.CharSequence) "hi! hi!", (-13), (-7));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\n", pattern1, "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n   \n       \n   \n\n", 150, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!", "hi! hi!\n\n hi!\n\n", "\rhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r   h i ! ", "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!", pattern1, " h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", 116);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", false, (int) '#', (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (int) '4', 116);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\n", true, 7, (java.lang.CharSequence) "\nhi!\nhi!\n", (-6), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n", (-15), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        char[] charArray9 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!", "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r   h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi! hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , h, i, !, \n, \n,  , h, i, !, \n, \n]");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " h i !   h i ! ", true, 9, (java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (int) (byte) 100, 285);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n   ", "\r", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n   " + "'", str3, "   \n   ");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { " ", "\r", "", "\n", "\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n   \n       \n   \n\n", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\n", "\r\nhi! hi!\n\n", "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!", 72, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", (java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", true, 94, (java.lang.CharSequence) "\n", (-94), (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int[] intArray1 = new int[] { 12 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[12]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\n", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi! hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!" + "'", str3, "hi! hi!");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        long[] longArray1 = new long[] { (-10) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n       \n   \n\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", (java.lang.CharSequence) "hi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        float[] floatArray2 = new float[] { (byte) 0, '#' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "  ", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "   \n   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n hi!\n\n\r\n", "\rhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        char[] charArray7 = new char[] { '\n', '#', '#', '4', '\r', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " h i !h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n##4\r4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n##4\r4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, #, #, 4, \r, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int[] intArray4 = new int[] { (-19), '\000', 12, 9 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-19, 0, 12, 9]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi! hi!\n hi! hi!\n\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 46, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   ", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n", pattern1, "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, h, \n, h, i, !,  , h, i, !, \n, \n, i, \n, h, i, !,  , h, i, !, \n, \n, !, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, h, \n, h, i, !,  , h, i, !, \n, \n, i, \n, h, i, !,  , h, i, !, \n, \n, !, \n, h, i, !,  , h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", pattern1, "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n\n hi!\n\n", "   ", "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n" + "'", str3, "hi! hi!\n\n hi!\n\n");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "hi! hi!\n", " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "   ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", false, 12, (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", 16, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (-10), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!\nhi!hi!hi!" + "'", str3, "hi!hi!hi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", false, (int) (byte) 100, (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-7), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "   ", "\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "hi!hi! hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n       \n   \n\n", "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n       \n   \n\n" + "'", str3, "\n   \n       \n   \n\n");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double[] doubleArray5 = new double[] { 100.0f, 10.0d, 10L, '\n', 3 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0, 10.0, 10.0, 3.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-14), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   ", pattern1, "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i ! ", (int) (short) 10, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r   h i ! ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "     h     i     !           h     i     !     ", 0, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) "hi!hi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        char[] charArray7 = new char[] { '\r', '4', ' ', '\000', '\r' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r4 \000\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r4 \000\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, 4,  , \000, \r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n   ", (java.lang.CharSequence) "hi!", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!\nhi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  ", (java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (-116), (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!", "hi!", "\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r hi!" + "'", str3, "\r \r hi!");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        short[] shortArray6 = new short[] { (short) -1, (short) 1, (short) 0, (short) 100, (short) -1, (byte) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !h i ! ", "hi!hi!", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !h i ! " + "'", str3, " h i !h i ! ");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r\r\n\r\n\r", "\r \r hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi! hi!\n\n", " h i !   h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   h i !   h i ! ", true, 294, (java.lang.CharSequence) "\n   \n       \n   \n\n", 0, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", 233);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", "\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!" + "'", str3, "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n hi!\n\n\r\n", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r \r hi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", 285);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n   \n       \n   \n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i !   h i ! ", "\n\n", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i ! " + "'", str3, " h i !   h i ! ");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", (-12), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double[] doubleArray5 = new double[] { 100.0f, 10.0d, 10L, '\n', 3 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0, 10.0, 10.0, 3.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        char[] charArray17 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray17);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray17);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray17);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray17);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   h i !   h i ! ", charArray17);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray17);
        int int29 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!", "hi!hi! hi!", "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\n", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n", "\n   \n       \n   \n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", false, (int) (short) -1, (java.lang.CharSequence) "   ", (-6), (-9));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n   ", "hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n   " + "'", str3, "   \n   ");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Class<?> wildcardClass2 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r \r hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence6, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\nhi!hi!", "hi!hi!hi!hi!", "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi! hi!\n\n hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", 103, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r\n\r\r\n\r\n\r", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int[] intArray4 = new int[] { (-19), '\000', 12, 9 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-19, 0, 12, 9]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!hi!hi!", (-15));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n\n hi!\n\n\r\n", "   h i !   h i ! ", "hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n\r\n" + "'", str3, "hi! hi!\n\n hi!\n\n\r\n");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\r\nhi! hi!\n\n", "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n       \n   \n\n", 103);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r", (int) (short) 1, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 0, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 17, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n hi! hi!\n\n\n", pattern1, "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n hi! hi!\n\n\n" + "'", str3, "hi! hi!\n hi! hi!\n\n\n");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "\nhi!\nhi!\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     h     i     !           h     i     !     ", (java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r \r hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (-94), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   h i !   h i ! ", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { " ", "\r", "", "\n", "\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!", pattern1, " \r   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\n   \n       \n   \n\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi! hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, h, \n, h, i, !,  , h, i, !, \n, \n, i, \n, h, i, !,  , h, i, !, \n, \n, !, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, h, \n, h, i, !,  , h, i, !, \n, \n, i, \n, h, i, !,  , h, i, !, \n, \n, !, \n, h, i, !,  , h, i, !, \n, \n,  , \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, h, \n, h, i, !,  , h, i, !, \n, \n, i, \n, h, i, !,  , h, i, !, \n, \n, !, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, \n, h, i, !,  , h, i, !, \n, \n, h, \n, h, i, !,  , h, i, !, \n, \n, i, \n, h, i, !,  , h, i, !, \n, \n, !, \n, h, i, !,  , h, i, !, \n, \n]");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\nhi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! hi!\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) "hi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.lang.String[] strArray2 = new java.lang.String[] { "", " " };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi! hi!\n\n", (java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", 94, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "\rhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " ", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        long[] longArray6 = new long[] { (short) 10, (short) 0, 10L, (short) 10, '4', (short) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 0, 10, 10, 52, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.lang.String[] strArray2 = new java.lang.String[] { "", " " };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray5 = new int[] { (byte) -1, 100, (-91), (byte) 100, 19 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, -91, 100, 19]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r", pattern1, "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 7, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!", "hi! hi!\n\n", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-9), 285);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!\n\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   h i !   h i ! ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!\nhi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\n", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!\n hi! hi!\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!? hi! hi!???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, \n, h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", pattern1, "\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "     h     i     !           h     i     !     ", (java.lang.CharSequence) "hi!hi!hi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", false, (-4), (java.lang.CharSequence) "\n", 7, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi! hi!", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\rhi!hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) '\000', 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

