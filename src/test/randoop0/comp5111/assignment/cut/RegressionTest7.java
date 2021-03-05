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
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 72, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", " \n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\n\nhi!\n", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", 441, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n", "\n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 19, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", 10, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("                   ", pattern1, " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (int) (short) 1, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!", pattern1, " \r  \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!" + "'", str3, "hi!\rhi!");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r  \r \r \r ", "                   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n", 559);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, (int) (short) 1, (java.lang.CharSequence) "    h    i    !    \n    ", 9, 615);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (int) '#', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.String[] strArray1 = new java.lang.String[] { "\n" };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", pattern1, "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "\n   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r  \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "hi!    ", "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("                   ", " \r \r \r ", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r ", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r ", pattern1, "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", true, (int) (byte) -1, (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 91, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, charSequence1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '#', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!    ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", 26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        java.lang.Class<?> wildcardClass5 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        float[] floatArray2 = new float[] { '4', 91 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[52.0, 91.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) " \n\nhi!\n", (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("                   ", "hi!    ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "hi!    ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        char[] charArray9 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n   \n   \n\r ", (java.lang.CharSequence) "   ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n", "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \r \r \r   \r \r \r ", "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double[] doubleArray5 = new double[] { 10, (-4), (byte) 10, 10L, (byte) -1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, -4.0, 10.0, 10.0, -1.0]");
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
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-8));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    h    i    !    \n    ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    " + "'", str3, "    h    i    !    \n    ");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\nhi!\n", pattern1, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\nhi!\n" + "'", str3, " \n\nhi!\n");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n   \n   \n", pattern1, " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n   \n   \n   \n", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r ", (-8), 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 180, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, \n, \n, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", (-92), (-65));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '#', 'a', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!", "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", " \n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    h    i    !    \n    ", true, 63, (java.lang.CharSequence) "hi!hi!\rhi!", 33, 639);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, 15, (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", 351, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "                   ", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\rhi!", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", (int) '\n', (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  ? ? ? ? ? ?hi!hhi!  ? ? ? ? ? ?hi!ihi!  ? ? ? ? ? ?hi!!hi!  ? ? ? ? ? ?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "hi!", "", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\rhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        char[] charArray8 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "    ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "    ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??????????????????????? ??????????????? ??????????????? ???????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", "\n                   \n                   \n                   \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", pattern1, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!" + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", " \r  \r \r \r ", " \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) " \n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", 180, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        int[] intArray3 = new int[] { (short) -1, 10, (byte) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r" + "'", str3, "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!    ", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r \r \r ", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r " + "'", str3, "  \r \r \r ");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        char[] charArray12 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 62, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r  \r \r \r ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r  \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r  \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r,  ,  , \r,  , \r,  , \r,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r ", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r" + "'", str3, "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\nhi!\n", "hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n   \n   \n   \n", "    ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, false, false, false]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", " \n\r\n\r\n\r\n \r \r ", "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n" + "'", str3, "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", 94, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n   \n   \n   \n", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r  \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n                   \n                   \n                   \n \r ", "  \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  ", "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        float[] floatArray5 = new float[] { 33, 615, 213, 100, 94 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[33.0, 615.0, 213.0, 100.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n   \n   \n", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, h,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, i,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, !,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, \n,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, \n,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, h,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, i,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, !,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, \n,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, \n,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, h,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, i,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, !,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, \n,  , \n, \n, h, i, !, \n,  , \n, \n, h, i, !, \n, \n]");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n", 0, 351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", 1, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "hi!    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        short[] shortArray11 = new short[] { (short) 10, (byte) 100, (short) 0, (byte) 10, (short) 1, (byte) 1 };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", " ", "\r", "\r", "" };
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray21);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { wildcardClass4, boolean15, str23 };
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray24);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray24);
        java.lang.Class<?> wildcardClass27 = objArray24.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 100, 0, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[class [C, false, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[class [C, false, ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "hi!\n\nhi!\n", "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r" + "'", str3, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", " \r  \r \r \r ", "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!" + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\rhi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r  \r \r \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\rhi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n   \n   \n", (int) (byte) -1, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    ", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", pattern1, "hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", " \r ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) " \n\nhi!\n", (-76));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (int) (short) 1, (-495));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("                   ", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        float[] floatArray6 = new float[] { '4', 9, 559, 1, (-1L), (-22) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 9.0, 559.0, 1.0, -1.0, -22.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n   \n   \n\r ", (int) '4', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", (java.lang.CharSequence) "hi!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n\r\n\r\n \r \r ", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r " + "'", str3, " \n\r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!    ", false, 351, (java.lang.CharSequence) "hi!\rhi!", (-495), 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (int) (byte) 100, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r \r \r   \r \r \r ", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r ");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    ", pattern1, "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\nhi!\n", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 32, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " \r\n   \n   \n   \n\r \r \r \r ", "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    h    i    !    \n    ", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (-559), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\nhi!\n", true, 94, charSequence3, (-5), 47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", 62, (-92));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true, 213, (java.lang.CharSequence) " ", (int) '\000', 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\nhi!\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\nhi!\n" + "'", str3, " \n\nhi!\n");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "                   ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\nhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "                   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "                   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, \n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n, \r,  , \r,  , \r,  , \r,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n]");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (-65), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "hi!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        char[] charArray12 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r  \r \r \r ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", (-8), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", (-559));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", "hi!\rhi!\rhi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\nhi!\n", charSequence1, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r \r \r ", 615, 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n   \n   \n\r ", (int) (short) 1, 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", 33, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "hi!  \n \n \n \n \n \nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "    ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "    ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", false, 0, (java.lang.CharSequence) "\n", 8, 116);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", 615, (-496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   ", charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n", "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", true, 0, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", (-3), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?    h    i    !    ?    ?    h    i    !    ?    ?    h    i    !    ?    ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) '\000', 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 8, (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (int) '4', 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "                   ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int[] intArray3 = new int[] { (short) -1, 10, (byte) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 100]");
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
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", false, (int) (byte) 10, (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", 40, 26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n\r\n\r\n \r \r ", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r " + "'", str3, " \n\r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \r\n   \n   \n   \n\r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23) + "'", int3 == (-23));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r" + "'", str3, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        float[] floatArray6 = new float[] { ' ', (byte) 10, (byte) -1, 1L, 100L, 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        java.lang.Class<?> wildcardClass12 = floatArray6.getClass();
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[32.0, 10.0, -1.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        char[] charArray11 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        char[] charArray13 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r ", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n                   \n                   \n                   \n \r ", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! " + "'", str3, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        short[] shortArray4 = new short[] { (byte) 1, (short) -1, (short) 1, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", (java.lang.CharSequence) " \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", (java.lang.CharSequence) "hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) " \r \r \r   \r \r \r ", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", " \r\n   \n   \n   \n\r \r \r \r ", "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        short[] shortArray2 = new short[] { (byte) 10, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        float[] floatArray1 = new float[] { 0 };
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
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n   \n   \n\r ", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        char[] charArray12 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   ", false, 40, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 100, 496);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, (-31), (java.lang.CharSequence) "\n   \n   \n   \n\r ", 31, 351);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", false, 16, (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 179, 496);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   ", "hi!  \n \n \n \n \n \nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true, 0, (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", 179, 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", pattern1, "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { '#', 'a', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

