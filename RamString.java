package cmsc256;

public class RamString implements WackyStringInterface
{
    private String userString;

    public RamString ()
    {
        this.userString = "Rodney, the Ram";
    }

    public RamString (String newString)
    {
        if (newString == null)
        {
            throw new IllegalArgumentException();
        }
        this.userString = newString;
    }

    @Override
    public void setWackyString(String string)
    {
        if (string == null)
        {
            throw new IllegalArgumentException();
        }

        this.userString = string;
    }

    @Override
    public String getWackyString()
    {
        return this.userString;
    }

    @Override
    public String getEveryThirdCharacter()
    {

        StringBuilder thirdCharacterAdd = new StringBuilder();
        String thirdCharacterResult;

        for (int k = 0; k < this.userString.length(); k++)
        {
                if (k % 3 == 2)
                {
                    thirdCharacterAdd.append(this.userString.charAt(k));
                }
        }

        thirdCharacterResult = thirdCharacterAdd.toString();

        return thirdCharacterResult;
    }

    @Override
    public boolean isValidVCUEmail()
    {
        String vcuEmailTester;


        for (int k = 0; k < this.userString.length(); k++)
        {
            if (this.userString.charAt(k) == '@')
            {

                if (k < 1)
                {
                    return false;
                }

                vcuEmailTester = this.userString.substring(k);
                return vcuEmailTester.equals("@vcu.edu") || vcuEmailTester.equals("@mymail.vcu.edu");
            }
        }

        return false;
    }

    @Override
    public void ramifyString()
    {

        StringBuilder ramifiedString = new StringBuilder(this.userString);

        for (int k = 0 ; k < ramifiedString.length(); k++)
        {
            if (ramifiedString.charAt(k) == '0') //
            {
                if (k != ramifiedString.length() - 1 && ramifiedString.charAt(k + 1) == '0') // 00
                {
                    if (k != ramifiedString.length() - 2 && ramifiedString.charAt(k + 2) == '0') // 000
                    {
                        k += 2;
                    }
                    else if (k != ramifiedString.length() - 2 && ramifiedString.charAt(k + 2) == ' ') // 00_
                    {
                        ramifiedString.replace(k, k + 2, "CS@VCU");
                    }
                    else //
                    {
                        ramifiedString.replace(k, k + 2, "CS@VCU");
                    }
                }
                else if (k != ramifiedString.length() - 1 && ramifiedString.charAt(k + 1) == ' ') // 0_
                {
                    ramifiedString.deleteCharAt(k);
                    ramifiedString.insert(k, "GoRams");
                }
                else // _0
                {
                    ramifiedString.deleteCharAt(k);
                    ramifiedString.insert(k, "GoRams");
                }
            }

            this.userString = ramifiedString.toString();
        }
    }

    @Override
    public void convertDigitsToRomanNumeralsInSubstring(int startPosition, int endPosition)
            throws MyIndexOutOfBoundsException, IllegalArgumentException
    {

        if (startPosition > endPosition && startPosition > this.userString.length() - (this.userString.length() - 1)
                && endPosition < this.userString.length())
        {
            throw new IllegalArgumentException();
        }
        else if (startPosition + 1 < (this.userString.length() - (this.userString.length() - 1) + 1)
                || endPosition + 1 > this.userString.length() + 1)
        {
            throw new MyIndexOutOfBoundsException();
        }


        StringBuilder mutatorString = new StringBuilder(this.userString);

        for (int k = startPosition - 1; k < endPosition; k++)
        {
            int romanNumeral = Integer.parseInt(String.valueOf(this.userString.charAt(k) - '0'));
            switch (romanNumeral)
            {
                case 1: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "I");
                        break;
                case 2: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "II");
                        k += 1;
                        endPosition += 1;
                        break;
                case 3: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "III");
                        k += 2;
                        endPosition += 2;
                        break;
                case 4: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "IV");
                        k += 1;
                        endPosition += 1;
                        break;
                case 5: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "V");
                        break;
                case 6: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "VI");
                        k += 1;
                        endPosition += 1;
                        break;
                case 7: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "VII");
                        k += 2;
                        endPosition += 2;
                        break;
                case 8: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "VIII");
                        k += 3;
                        endPosition += 3;
                        break;
                case 9: mutatorString.deleteCharAt(k);
                        mutatorString.insert(k, "IX");
                        k += 1;
                        endPosition += 1;
                        break;
            }

            this.userString = mutatorString.toString();
        }

    }
}
