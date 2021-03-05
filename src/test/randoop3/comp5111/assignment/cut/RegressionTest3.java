package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", pattern1, "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 158 + "'", int1 == 158);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", 0, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "    \r       \r   \n \r\n  \r \n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n " + "'", str3, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  , \n,  , \n,  , \n, \r, \n,  , \n,  , \n,  , \n, \n, \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (-5), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) " ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "  \r ", "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 113 + "'", int13 == 113);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", false, 100, (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (-13), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r \r \r ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ", (-621));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", 10, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (-35), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        char[] charArray7 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "\r", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charSequence1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:     ?       ?   ? ??  ? ? ?    ?       ?   ? ??  ? ? ?    ?       ?   ? ??  ? ? ?    ?       ?   ? ??  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", pattern1, " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r ", (-36), 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \n,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r ", " \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (-16), 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "hi! ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", false, 13, (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", 13, (-26));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r h \r i \r ! \r   \r ", pattern1, " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r " + "'", str3, " \r h \r i \r ! \r   \r ");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r ", 10, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \r\n ", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", pattern1, "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "   \r   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-12), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", 107, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r       \r     \r \r  \r \n ", "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ", (-621));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r h \r i \r ! \r   \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? h ? i ? ! ?   ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", (-5), (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n ", "\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "  \r \r        \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        char[] charArray10 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \n ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", charArray10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   ", "\n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r \r \r ", "  \n  \r \r   \n \r\n ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   ", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r ", "   \r   \n ", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r ", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r, \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \n,  ,  , \r,  , \r,  ]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \r \r        \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 34, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", 26, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", 6, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", pattern1, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n ", "       \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r \r        \n ", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 81 + "'", int1 == 81);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "  \n  \r \r   \n \r\n ", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 15, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        char[] charArray7 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 7, (java.lang.CharSequence) "  \r \r \r   \n \r\n ", (-621), (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! " + "'", str3, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r        \n ", (-13), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "\r", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "  \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?   ? ??    ?   ? ?? ?   ?   ? ?? ?   ?   ? ?? ?   ?   ? ??    ?   ? ??    ?   ? ?? ?   ?   ? ?? ??   ?   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", 27, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r \r        \n ", false, 0, (java.lang.CharSequence) "   \r   \n \r\n ", (int) '\n', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  hi!  hi! ?hi! ?hi! ?hi!  hi!  hi!  hi! ?hi!  hi! ?hi! ?hi!  hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "  \r ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \r\n ", "    \r       \r   \n \r\n  \r \n ", "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  ,  ,  , \n,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("         \r    \r \r   \n \r\n     \n  \r \n ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! ", "  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r ", "hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r " + "'", str3, "  \r ");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r        \n ", 85, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n ", pattern1, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", pattern1, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "\n ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", true, 0, (java.lang.CharSequence) "\r", (int) '\n', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (-36), (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "   \r   ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (java.lang.CharSequence) "hi! ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r \r \r ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", pattern1, " \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n ", "   \r   \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "\n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "  \r \r        \n ", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r \r ", " \r h \r i \r ! \r   \r ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 444 + "'", int3 == 444);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "       \n ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi! hi! ??hi! hi! hi! ??hi! hi!       ?       ?   hi! ?hi!  ? hi!    hi! ?hi!    ?   hi! ?hi! ?   ?   hi! ?hi! ?   ?   hi! ?hi! ?   ?   hi! ?hi!    ?   hi! ?hi!    ?   hi! ?hi! hi!   ?   hi! ?hi! ?hi!   ?   hi! ?hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", pattern1, "  \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n ", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (int) (byte) 0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \r \r ", 85);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r        \n ", "  \r \r \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r ", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", true, 19, (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (-5), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", pattern1, "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (int) (short) 1, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   ", (java.lang.CharSequence) "  \r \r ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r ", pattern1, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        long[] longArray3 = new long[] { (short) 10, '\n', (-72) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass5 = longArray3.getClass();
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, -72]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", pattern1, "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "       \n ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \n ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        short[] shortArray1 = new short[] { (short) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        java.lang.Class<?> wildcardClass3 = shortArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (-22), 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (int) (short) 1, (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n ", (int) (byte) -1, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", "    \r       \r   \n \r\n  \r \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n\n\r   \n \r\n ", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("         \r    \r \r   \n \r\n     \n  \r \n ", " \r \r \r ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \r\n ", true, (int) '\n', (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", 15, 31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\r", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r    \n  \r \n ", "    \r       \r     \r \r  \r \n ", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3 == 629);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  ,  ,  , \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r, \n,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 91, 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (-13), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r \r \r \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   \n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        char[] charArray8 = new char[] { 'a', '4', '#', '\r', 'a', '\n' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#\ra\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#\ra\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #, \r, a, \n]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "   \r   ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n \r\n ", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n\n\r   \n \r\n ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "       \n ", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n ", " ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \r \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r ", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r \r \r \r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n ", (-621), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "   \r   \n ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 12, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        float[] floatArray5 = new float[] { '#', 19, '\r', 100L, (short) 100 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        java.lang.Class<?> wildcardClass8 = floatArray5.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[35.0, 19.0, 13.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "  \r \r ", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r ", pattern1, "\n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r       \r     \r \r  \r \n ", " \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 677 + "'", int1 == 677);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r ", 31, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false, 69, (java.lang.CharSequence) "  \r \r        \n ", (-7), 34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-114), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "  \r \r        \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \r   \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?   ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \r \r        \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n " + "'", str3, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", (-19), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r ", pattern1, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r ", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "  \n  \r \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "      \n  \r \r   \n \r\n     \n  \r \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r ", "   \r   \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n\n\r   \n \r\n ", 158, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (int) (short) -1, 677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? ? ??? ? ? ??? ?       ?     ? ?    ? ?? ?????? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", pattern1, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", (java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r     \r \r  \r \n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "   \r   \n \r\n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:       ???                ?  ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?   ? ??             ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?     ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ?   ? ??     ?   ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ?  ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?          ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?     ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ?   ? ??     ?   ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", 36, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (java.lang.CharSequence) " \r ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 15, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (int) (short) -1, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (int) (byte) 100, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n ", (int) (byte) 10, 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        char[] charArray5 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r h \r i \r ! \r   \r ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r " + "'", str3, " \r h \r i \r ! \r   \r ");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", " \r h \r i \r ! \r   \r ", "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) " \n  \r \r ", 629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r \r \r \r \r \r \r ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r ", pattern1, "\n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        char[] charArray6 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n  \r \r   \n \r\n ", pattern1, "\n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", 34, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", "  \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ,  , h, i, !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (-3), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", " \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "  \n  \r \r   \n \r\n ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n  \r \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "       \n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "       \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "       \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  ,  ,  ,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \n ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", 91, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 5, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \n  \r \r ", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r \r \r \r \r ", "         \r    \r \r   \n \r\n     \n  \r \n ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \r \r \r \r " + "'", str3, " \r \r \r \r \r \r \r ");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r ", true, (-90), (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 10, 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n  \r \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r ", "  \r \r        \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (-35), 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "  \r \r \r   \n \r\n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   ", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int[] intArray2 = new int[] { '\r', 2 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[13, 2]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \r \r \r ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r \r \r ", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r ", pattern1, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "  \n\n\r   \n \r\n ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r \r        \n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  \r \r        \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  \r \r        \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , \r,  , \r,  ,  ,  ,  ,  ,  ,  ,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", "         \r    \r \r   \n \r\n     \n  \r \n ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n " + "'", str3, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", true, (int) (byte) 100, (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 10, 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:        ?       ?   ? ??  ? ?    ? ??    ?   ? ?? ?   ?   ? ?? ?   ?   ? ?? ?   ?   ? ??    ?   ? ??    ?   ? ?? ?   ?   ? ?? ??   ?   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r ", (-9));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

