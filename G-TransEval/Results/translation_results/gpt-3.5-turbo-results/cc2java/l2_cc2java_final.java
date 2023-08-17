boolean HasCloseElements ( ArrayList < Double > numbers , double threshold ) { for ( int i = 0 ; i < numbers . size ( ) ; i ++ ) { for ( int j = i + 1 ; j < numbers . size ( ) ; j ++ ) { double distance = Math . abs ( numbers . get ( i ) - numbers . get ( j ) ) ; if ( distance < threshold ) { return true ; } } } return false ; } 
double TruncateNumber ( double number ) { return Math . IEEEremainder ( number , 1 ) ; } 
boolean belowZero ( List < Integer > operations ) { int balance = 0 ; for ( int op : operations ) { balance += op ; if ( balance < 0 ) { return true ; } } return false ; } 
double MeanAbsoluteDeviation ( ArrayList < Double > numbers ) { double sum_num = 0 ; for ( double num : numbers ) { sum_num += num ; } double mean = sum_num / numbers . size ( ) ; double sum_abs_diff = 0 ; for ( double num : numbers ) { sum_abs_diff += Math . abs ( num - mean ) ; } return sum_abs_diff / numbers . size ( ) ; } 
ArrayList < Integer > intersperse ( ArrayList < Integer > numbers , int delimiter ) { ArrayList < Integer > result = new ArrayList < Integer > ( ) ; if ( numbers . isEmpty ( ) ) { return result ; } for ( int i = 0 ; i < numbers . size ( ) - 1 ; i ++ ) { result . add ( numbers . get ( i ) ) ; result . add ( delimiter ) ; } result . add ( numbers . get ( numbers . size ( ) - 1 ) ) ; return result ; } 
List < Integer > SumProduct ( List < Integer > numbers ) { int sum_value = 0 ; int prod_value = 1 ; for ( int n : numbers ) { sum_value += n ; prod_value *= n ; } List < Integer > result = new ArrayList < Integer > ( ) ; result . add ( sum_value ) ; result . add ( prod_value ) ; return result ; } 
ArrayList < String > allPrefixes ( String s ) { ArrayList < String > result = new ArrayList < > ( ) ; for ( int i = 1 ; i <= s . length ( ) ; i ++ ) { result . add ( s . substring ( 0 , i ) ) ; } return result ; } 
List < Integer > parseMusic ( String music_string ) { String current = "" ; List < Integer > result = new ArrayList < > ( ) ; for ( int i = 0 ; i <= music_string . length ( ) ; i ++ ) { if ( i == music_string . length ( ) || music_string . charAt ( i ) == ' ' ) { if ( current . equals ( "o" ) ) { result . add ( 4 ) ; } if ( current . equals ( "o|" ) ) { result . add ( 2 ) ; } if ( current . equals ( ".|" ) ) { result . add ( 1 ) ; } current = "" ; } else { current += music_string . charAt ( i ) ; } } return result ; } 
int Strlen ( String s ) { return s . length ( ) ; } 
import java . util . ArrayList ; 
String concatenate ( List < String > strings ) { String result = "" ; for ( String s : strings ) { result += s ; } return result ; } 
List < Double > getPositive ( List < Double > l ) { List < Double > result = new ArrayList < > ( ) ; for ( int i = 0 ; i < l . size ( ) ; i ++ ) { if ( l . get ( i ) > 0 ) { result . add ( l . get ( i ) ) ; } } return result ; } 
ArrayList < Double > sortEven ( ArrayList < Double > l ) { ArrayList < Double > evens = new ArrayList < > ( ) ; for ( int i = 0 ; i < l . size ( ) ; i += 2 ) { evens . add ( l . get ( i ) ) ; } Collections . sort ( evens ) ; ArrayList < Double > result = new ArrayList < > ( ) ; for ( int i = 0 ; i < l . size ( ) ; i ++ ) { if ( i % 2 == 0 ) { result . add ( evens . get ( i / 2 ) ) ; } if ( i % 2 == 1 ) { result . add ( l . get ( i ) ) ; } } return result ; } 
String DecodeCyclic ( String s ) { String output = "" ; int i = 0 ; while ( i <= ( s . length ( ) - 3 ) ) { String x = s . charAt ( i + 2 ) + s . substring ( i , i + 2 ) ; output += x ; i += 3 ; } return output + s . substring ( i ) ; } 
int carRaceCollision ( int n ) { return ( int ) Math . pow ( n , 2 ) ; } 
import java . util . ArrayList ; 
boolean pairsSumToZero ( ArrayList < Integer > l ) { for ( int i = 0 ; i < l . size ( ) ; i ++ ) { for ( int j = i + 1 ; j < l . size ( ) ; j ++ ) { if ( l . get ( i ) + l . get ( j ) == 0 ) { return true ; } } } return false ; } 
String changeBase ( int x , int b ) { String ret = "" ; while ( x > 0 ) { ret = ( x % b ) + ret ; x /= b ; } return ret ; } 
double median ( List < Double > l ) { Collections . sort ( l ) ; if ( l . size ( ) % 2 == 1 ) { return l . get ( l . size ( ) / 2 ) ; } return ( l . get ( l . size ( ) / 2 ) + l . get ( l . size ( ) / 2 - 1 ) ) / 2 ; } 
String DecodeShift ( String s ) { String result = "" ; for ( char ch : s . toCharArray ( ) ) { char w = ( char ) ( ( ch + 21 - 'a' ) % 26 + 'a' ) ; result += w ; } return result ; } 
boolean belowThreshold ( List < Integer > l , int t ) { for ( int n : l ) { if ( n >= t ) { return false ; } } return true ; } 
boolean CorrectBracketing ( String brackets ) { int depth = 0 ; for ( int i = 0 ; i < brackets . length ( ) ; i ++ ) { char b = brackets . charAt ( i ) ; if ( b == '<' ) { depth += 1 ; } if ( b == '>' ) { depth -= 1 ; } if ( depth < 0 ) { return false ; } } return depth == 0 ; } 
boolean Monotonic ( ArrayList < Double > l ) { int incr = 0 ; int decr = 0 ; for ( int i = 1 ; i < l . size ( ) ; i ++ ) { if ( l . get ( i ) > l . get ( i - 1 ) ) { incr = 1 ; } if ( l . get ( i ) < l . get ( i - 1 ) ) { decr = 1 ; } } return incr + decr != 2 ; } 
ArrayList < Double > Derivative ( ArrayList < Double > xs ) { ArrayList < Double > result = new ArrayList < > ( ) ; for ( int i = 1 ; i < xs . size ( ) ; i ++ ) { result . add ( i * xs . get ( i ) ) ; } return result ; } 
int vowelsCount ( String s ) { String vowels = "aeiouAEIOU" ; int count = 0 ; for ( int i = 0 ; i < s . length ( ) ; i ++ ) { if ( vowels . contains ( Character . toString ( s . charAt ( i ) ) ) ) { count += 1 ; } } if ( s . charAt ( s . length ( ) - 1 ) == 'y' || s . charAt ( s . length ( ) - 1 ) == 'Y' ) { count += 1 ; } return count ; } 
int digitSum ( String s ) { int sum = 0 ; for ( int i = 0 ; i < s . length ( ) ; i ++ ) { char c = s . charAt ( i ) ; if ( Character . isUpperCase ( c ) ) { sum += c ; } } return sum ; } 
int FruitDistribution ( String s , int n ) { String num1 = "" ; String num2 = "" ; boolean flag = false ; for ( int i = 0 ; i < s . length ( ) ; i ++ ) { if ( Character . isDigit ( s . charAt ( i ) ) ) { if ( ! flag ) { num1 += s . charAt ( i ) ; } if ( flag ) { num2 += s . charAt ( i ) ; } } else if ( ! flag && num1 . length ( ) > 0 ) { flag = true ; } } return n - Integer . parseInt ( num1 ) - Integer . parseInt ( num2 ) ; } 
ArrayList < Integer > Pluck ( ArrayList < Integer > arr ) { ArrayList < Integer > result = new ArrayList < > ( ) ; for ( int i = 0 ; i < arr . size ( ) ; i ++ ) { if ( arr . get ( i ) % 2 == 0 ) { if ( result . isEmpty ( ) ) { result . add ( arr . get ( i ) ) ; result . add ( i ) ; } else if ( arr . get ( i ) < result . get ( 0 ) ) { result . set ( 0 , arr . get ( i ) ) ; result . set ( 1 , i ) ; } } } return result ; } 
ArrayList < Integer > strangeSortList ( ArrayList < Integer > lst ) { ArrayList < Integer > res = new ArrayList < Integer > ( ) ; Collections . sort ( lst ) ; int l = 0 ; int r = lst . size ( ) - 1 ; while ( l < r ) { res . add ( lst . get ( l ) ) ; l += 1 ; res . add ( lst . get ( r ) ) ; r -= 1 ; } if ( l == r ) { res . add ( lst . get ( l ) ) ; } return res ; } 
double triangleArea ( double a , double b , double c ) { if ( a + b <= c || a + c <= b || b + c <= a ) { return - 1 ; } double s = ( a + b + c ) / 2 ; return Math . sqrt ( s * ( s - a ) * ( s - b ) * ( s - c ) ) ; } 
boolean willItFly ( List < Integer > q , int w ) { int sum = 0 ; for ( int i = 0 ; i < q . size ( ) ; i ++ ) { if ( q . get ( i ) != q . get ( q . size ( ) - i - 1 ) ) { return false ; } sum += q . get ( i ) ; } return sum <= w ; } 
boolean isCube ( int a ) { a = Math . abs ( a ) ; int i = ( int ) Math . round ( Math . pow ( a , 1.0 / 3 ) ) ; return Math . pow ( i , 3 ) == a ; } 
int HexKey ( String num ) { String key = "2357BD" ; int total = 0 ; for ( char c : num . toCharArray ( ) ) { if ( key . indexOf ( c ) != - 1 ) { total += 1 ; } } return total ; } 
String decimalToBinary ( int dec ) { StringBuilder ans = new StringBuilder ( ) ; if ( dec != 0 ) { while ( dec > 0 ) { ans . insert ( 0 , String . valueOf ( dec % 2 ) ) ; dec /= 2 ; } } else { ans . append ( "0" ) ; } return "db" + ans + "db" ; } 
boolean primeLength ( String s ) { int l = s . length ( ) ; if ( l < 2 ) { return false ; } for ( int i = 2 ; i < l ; i ++ ) { if ( l % i == 0 ) { return false ; } } return true ; } 
int startsOneEnds ( int n ) { if ( n < 1 ) { return 0 ; } if ( n == 1 ) { return 1 ; } return 18 * ( int ) Math . pow ( 10 , n - 2 ) ; } 
int add ( Vector < Integer > lst ) { int sum = 0 ; for ( int i = 1 ; i < lst . size ( ) ; i += 2 ) { if ( lst . get ( i ) % 2 == 0 ) { sum += lst . get ( i ) ; } } return sum ; } 
List < List < Integer > > getRow ( List < List < Integer > > lst , int x ) { List < List < Integer > > coords = new ArrayList < > ( ) ; for ( int i = 0 ; i < lst . size ( ) ; i ++ ) { for ( int j = lst . get ( i ) . size ( ) - 1 ; j >= 0 ; j -- ) { if ( lst . get ( i ) . get ( j ) == x ) { List < Integer > coord = new ArrayList < > ( ) ; coord . add ( i ) ; coord . add ( j ) ; coords . add ( coord ) ; } } } return coords ; } 
int NextSmallest ( Vector < Integer > lst ) { Collections . sort ( lst ) ; for ( int i = 1 ; i < lst . size ( ) ; i ++ ) { if ( ! lst . get ( i ) . equals ( lst . get ( i - 1 ) ) ) { return lst . get ( i ) ; } } return - 1 ; } 
boolean anyInt ( double a , double b , double c ) { if ( Math . round ( a ) != a || Math . round ( b ) != b || Math . round ( c ) != c ) { return false ; } return a + b == c || a + c == b || b + c == a ; } 
import java . util . ArrayList ; 
int closestInteger ( String value ) { double w = Double . parseDouble ( value ) ; return Math . round ( ( float ) w ) ; } 
import java . util . ArrayList ; 
ArrayList < String > WordsString ( String s ) { String current = "" ; ArrayList < String > words = new ArrayList < String > ( ) ; for ( int i = 0 ; i <= s . length ( ) ; i ++ ) { if ( i == s . length ( ) || s . charAt ( i ) == ' ' || s . charAt ( i ) == ',' ) { if ( current . length ( ) > 0 ) { words . add ( current ) ; current = "" ; } } else { current += s . charAt ( i ) ; } } return words ; } 
String RoundedAvg ( int n , int m ) { if ( n > m ) { return "-1" ; } int num = ( m + n ) / 2 ; StringBuilder ret = new StringBuilder ( ) ; while ( num > 0 ) { ret . insert ( 0 , num % 2 ) ; num /= 2 ; } return ret . toString ( ) ; } 
ArrayList < Integer > uniqueDigits ( ArrayList < Integer > x ) { ArrayList < Integer > digits = new ArrayList < > ( ) ; for ( int n : x ) { boolean is_unique = true ; for ( char c : Integer . toString ( n ) . toCharArray ( ) ) { if ( c % 2 == 0 ) { is_unique = false ; break ; } } if ( is_unique ) { digits . add ( n ) ; } } Collections . sort ( digits ) ; return digits ; } 
int CountNums ( List < Integer > arr ) { int num = 0 ; for ( int n : arr ) { int neg = n < 0 ? - 1 : 1 ; n = Math . abs ( n ) ; List < Integer > digits = new ArrayList < > ( ) ; for ( char c : Integer . toString ( n ) . toCharArray ( ) ) { digits . add ( Character . getNumericValue ( c ) ) ; } digits . set ( 0 , digits . get ( 0 ) * neg ) ; int sum = 0 ; for ( int d : digits ) { sum += d ; } if ( sum > 0 ) { num += 1 ; } } return num ; } 
boolean MoveOneBall ( ArrayList < Integer > arr ) { if ( arr . isEmpty ( ) ) { return true ; } int num = 0 ; for ( int i = 1 ; i < arr . size ( ) ; i ++ ) { if ( arr . get ( i ) < arr . get ( i - 1 ) ) { num += 1 ; } } if ( arr . get ( arr . size ( ) - 1 ) > arr . get ( 0 ) ) { num += 1 ; } if ( num < 2 ) { return true ; } return false ; } 
String exchange ( Vector < Integer > lst1 , Vector < Integer > lst2 ) { int odd = 0 ; int even = 0 ; for ( int n : lst1 ) { if ( n % 2 == 1 ) { odd += 1 ; } } for ( int n : lst2 ) { if ( n % 2 == 0 ) { even += 1 ; } } if ( even >= odd ) { return "YES" ; } return "NO" ; } 
List < String > OddCount ( List < String > lst ) { List < String > results = new ArrayList < String > ( ) ; String original_str = "the number of odd elements in the string i of the input." ; for ( String s : lst ) { int sum = 0 ; for ( char d : s . toCharArray ( ) ) { if ( Character . isDigit ( d ) && d % 2 == 1 ) { sum += 1 ; } } String result = "" ; for ( char c : original_str . toCharArray ( ) ) { if ( c == 'i' ) { result += Integer . toString ( sum ) ; } else { result += c ; } } results . add ( result ) ; } return results ; } 
int minSubArraySum ( List < Integer > nums ) { int min_sum = Integer . MAX_VALUE ; int sum = 0 ; for ( int num : nums ) { sum += num ; if ( min_sum > sum ) { min_sum = sum ; } if ( sum > 0 ) { sum = 0 ; } } return min_sum ; } 
int maxFill ( List < List < Integer > > grid , int capacity ) { int res = 0 ; for ( List < Integer > well : grid ) { int sum = 0 ; for ( int n : well ) { sum += n ; } if ( sum > 0 ) { res += ( sum - 1 ) / capacity + 1 ; } } return res ; } 
List < String > SelectWords ( String s , int n ) { String vowels = "aeiouAEIOU" ; String current = "" ; ArrayList < String > result = new ArrayList < String > ( ) ; int consonant_num = 0 ; for ( int i = 0 ; i <= s . length ( ) ; i ++ ) { if ( i == s . length ( ) || s . charAt ( i ) == ' ' ) { if ( consonant_num == n ) { result . add ( current ) ; } current = "" ; consonant_num = 0 ; } else { current += s . charAt ( i ) ; if ( vowels . indexOf ( s . charAt ( i ) ) == - 1 ) { consonant_num += 1 ; } } } return result ; } 
int Solution ( List < Integer > lst ) { int sum = 0 ; for ( int i = 0 ; i < lst . size ( ) ; i += 2 ) { if ( lst . get ( i ) % 2 == 1 ) { sum += lst . get ( i ) ; } } return sum ; } 
int addElements ( ArrayList < Integer > arr , int k ) { int sum = 0 ; for ( int i = 0 ; i < k ; i ++ ) { if ( arr . get ( i ) >= - 99 && arr . get ( i ) <= 99 ) { sum += arr . get ( i ) ; } } return sum ; } 
ArrayList < Integer > getOddCollatz ( int n ) { ArrayList < Integer > oddCollatz = new ArrayList < Integer > ( ) ; while ( n != 1 ) { if ( n % 2 == 1 ) { oddCollatz . add ( n ) ; n = n * 3 + 1 ; } else { n /= 2 ; } } oddCollatz . add ( 1 ) ; Collections . sort ( oddCollatz ) ; return oddCollatz ; } 
boolean IsSorted ( ArrayList < Integer > lst ) { for ( int i = 1 ; i < lst . size ( ) ; i ++ ) { if ( lst . get ( i ) < lst . get ( i - 1 ) ) { return false ; } if ( i >= 2 && lst . get ( i ) == lst . get ( i - 1 ) && lst . get ( i ) == lst . get ( i - 2 ) ) { return false ; } } return true ; } 
String intersection ( List < Integer > interval1 , List < Integer > interval2 ) { int inter1 = Math . max ( interval1 . get ( 0 ) , interval2 . get ( 0 ) ) ; int inter2 = Math . min ( interval1 . get ( 1 ) , interval2 . get ( 1 ) ) ; int l = inter2 - inter1 ; if ( l < 2 ) { return "NO" ; } for ( int i = 2 ; i < l ; i ++ ) { if ( l % i == 0 ) { return "NO" ; } } return "YES" ; } 
int ProdSigns ( ArrayList < Integer > arr ) { if ( arr . isEmpty ( ) ) { return - 32768 ; } int sum = 0 ; int prods = 1 ; for ( int i : arr ) { sum += Math . abs ( i ) ; if ( i == 0 ) { prods = 0 ; } if ( i < 0 ) { prods = - prods ; } } return sum * prods ; } 
List < Integer > MinPath ( List < List < Integer > > grid , int k ) { int n = grid . size ( ) ; int min_num = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( grid . get ( i ) . get ( j ) == 1 ) { List < Integer > tmp = new ArrayList < > ( ) ; if ( i != 0 ) { tmp . add ( grid . get ( i - 1 ) . get ( j ) ) ; } if ( j != 0 ) { tmp . add ( grid . get ( i ) . get ( j - 1 ) ) ; } if ( i != n - 1 ) { tmp . add ( grid . get ( i + 1 ) . get ( j ) ) ; } if ( j != n - 1 ) { tmp . add ( grid . get ( i ) . get ( j + 1 ) ) ; } min_num = Collections . min ( tmp ) ; } } } List < Integer > ans = new ArrayList < > ( ) ; for ( int i = 0 ; i < k ; i ++ ) { if ( i % 2 == 0 ) { ans . add ( 1 ) ; } else { ans . add ( min_num ) ; } } return ans ; } 
int Digits ( int n ) { int prod = 0 ; String strN = Integer . toString ( n ) ; for ( int i = 0 ; i < strN . length ( ) ; i ++ ) { char digit = strN . charAt ( i ) ; if ( digit % 2 == 1 ) { if ( prod == 0 ) { prod = 1 ; } prod *= ( digit - '0' ) ; } } return prod ; } 
boolean IsNested ( String s ) { int count = 0 ; int max_count = 0 ; for ( char ch : s . toCharArray ( ) ) { if ( ch == '[' ) { count += 1 ; } if ( ch == ']' ) { count -= 1 ; } if ( count < 0 ) { count = 0 ; } if ( count > max_count ) { max_count = count ; } if ( count <= max_count - 2 ) { return true ; } } return false ; } 
int SumSquares ( ArrayList < Double > lst ) { int sum = 0 ; for ( double i : lst ) { sum += Math . ceil ( i ) * Math . ceil ( i ) ; } return sum ; } 
int CanArrange ( ArrayList < Integer > arr ) { int index = - 1 ; for ( int i = 0 ; i < arr . size ( ) ; i ++ ) { if ( arr . get ( i ) <= i ) { index = i ; } } return index ; } 
Vector < Integer > largestSmallestIntegers ( Vector < Integer > lst ) { int max_neg = 0 , min_pos = 0 ; for ( int n : lst ) { if ( n < 0 && ( max_neg == 0 || n > max_neg ) ) { max_neg = n ; } if ( n > 0 && ( min_pos == 0 || n < min_pos ) ) { min_pos = n ; } } Vector < Integer > results = new Vector < Integer > ( ) ; results . add ( max_neg ) ; results . add ( min_pos ) ; return results ; } 
String fixSpaces ( String text ) { String res = "" ; int space_len = 0 ; for ( int i = 0 ; i <= text . length ( ) ; i ++ ) { if ( i == text . length ( ) || text . charAt ( i ) != ' ' ) { if ( space_len == 1 ) { res += '_' ; } if ( space_len == 2 ) { res += "__" ; } if ( space_len > 2 ) { res += '-' ; } space_len = 0 ; if ( i != text . length ( ) ) { res += text . charAt ( i ) ; } } else { space_len += 1 ; } } return res ; } 
String fileNameCheck ( String fileName ) { int digit_num = 0 , dot_num = 0 ; if ( fileName . length ( ) < 5 || ! Character . isLetter ( fileName . charAt ( 0 ) ) ) { return "No" ; } String suffix = fileName . substring ( fileName . length ( ) - 4 ) ; if ( ! suffix . equals ( ".txt" ) && ! suffix . equals ( ".exe" ) && ! suffix . equals ( ".dll" ) ) { return "No" ; } for ( char c : fileName . toCharArray ( ) ) { if ( Character . isDigit ( c ) ) { digit_num += 1 ; } if ( c == '.' ) { dot_num += 1 ; } } if ( digit_num > 3 || dot_num != 1 ) { return "No" ; } return "Yes" ; } 
int SumSquares ( List < Integer > lst ) { int sum = 0 ; for ( int i = 0 ; i < lst . size ( ) ; i ++ ) { if ( i % 3 == 0 ) { sum += lst . get ( i ) * lst . get ( i ) ; } else if ( i % 4 == 0 ) { sum += lst . get ( i ) * lst . get ( i ) * lst . get ( i ) ; } else { sum += lst . get ( i ) ; } } return sum ; } 
String wordsInSentence ( String sentence ) { String result = "" ; String current = "" ; for ( int i = 0 ; i <= sentence . length ( ) ; i ++ ) { if ( i == sentence . length ( ) || sentence . charAt ( i ) == ' ' ) { boolean isPrime = true ; int l = current . length ( ) ; if ( l < 2 ) { isPrime = false ; } for ( int j = 2 ; j < l ; j ++ ) { if ( l % j == 0 ) { isPrime = false ; break ; } } if ( isPrime ) { result += current + " " ; } current = "" ; } else { current += sentence . charAt ( i ) ; } } if ( result . length ( ) > 0 ) { result = result . substring ( 0 , result . length ( ) - 1 ) ; } return result ; } 
boolean Simplify ( String x , String n ) { int a = 0 , b = 0 , c = 0 , d = 0 ; for ( int i = 0 ; i < x . length ( ) ; i ++ ) { if ( x . charAt ( i ) == '/' ) { a = Integer . parseInt ( x . substring ( 0 , i ) ) ; b = Integer . parseInt ( x . substring ( i + 1 ) ) ; } } for ( int i = 0 ; i < n . length ( ) ; i ++ ) { if ( n . charAt ( i ) == '/' ) { c = Integer . parseInt ( n . substring ( 0 , i ) ) ; d = Integer . parseInt ( n . substring ( i + 1 ) ) ; } } return ( a * c ) % ( b * d ) == 0 ; } 
int SpecialFilter ( List < Integer > nums ) { int count = 0 ; for ( int num : nums ) { if ( num > 10 ) { String w = Integer . toString ( num ) ; if ( w . charAt ( 0 ) % 2 == 1 && w . charAt ( w . length ( ) - 1 ) % 2 == 1 ) { count += 1 ; } } } return count ; } 
int GetMatrixTriples ( int n ) { ArrayList < Integer > arr = new ArrayList < Integer > ( ) ; for ( int i = 1 ; i <= n ; i ++ ) { arr . add ( i * i - i + 1 ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = i + 1 ; j < n ; j ++ ) { for ( int k = j + 1 ; k < n ; k ++ ) { if ( ( arr . get ( i ) + arr . get ( j ) + arr . get ( k ) ) % 3 == 0 ) { count += 1 ; } } } } return count ; } 
int DoubleTheDifference ( ArrayList < Double > lst ) { int sum = 0 ; for ( double d : lst ) { int num = ( int ) Math . round ( d ) ; if ( d == num ) { if ( num > 0 && num % 2 == 1 ) { sum += num * num ; } } } return sum ; } 
List < Integer > compare ( List < Integer > game , List < Integer > guess ) { List < Integer > result = new ArrayList < Integer > ( ) ; for ( int i = 0 ; i < game . size ( ) ; i ++ ) { result . add ( Math . abs ( game . get ( i ) - guess . get ( i ) ) ) ; } return result ; } 
String StrongestExtension ( String class_name , List < String > extensions ) { String strongest = "" ; int max = Integer . MIN_VALUE ; for ( String extension : extensions ) { int strength = 0 ; for ( char chr : extension . toCharArray ( ) ) { if ( Character . isUpperCase ( chr ) ) { strength += 1 ; } if ( Character . isLowerCase ( chr ) ) { strength -= 1 ; } } if ( strength > max ) { max = strength ; strongest = extension ; } } return class_name + "." + strongest ; } 
String intToMiniRoman ( int number ) { List < Integer > num = Arrays . asList ( 1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1 ) ; List < String > sym = Arrays . asList ( "m" , "cm" , "d" , "cd" , "c" , "xc" , "l" , "xl" , "x" , "ix" , "v" , "iv" , "i" ) ; int pos = 0 ; String res = "" ; while ( number > 0 ) { while ( number >= num . get ( pos ) ) { res += sym . get ( pos ) ; number -= num . get ( pos ) ; } if ( number > 0 ) { pos += 1 ; } } return res ; } 
List < Integer > Eat ( int number , int need , int remaining ) { if ( need > remaining ) { return Arrays . asList ( number + remaining , 0 ) ; } else { return Arrays . asList ( number + need , remaining - need ) ; } } 
int DoAlgebra ( ArrayList < String > ops , ArrayList < Integer > operands ) { ArrayList < Integer > nums = new ArrayList < Integer > ( operands ) ; ArrayList < String > current_ops = new ArrayList < String > ( ops ) ; int i = current_ops . size ( ) - 1 ; while ( i >= 0 ) { if ( current_ops . get ( i ) . equals ( "**" ) ) { nums . set ( i , ( int ) Math . pow ( nums . get ( i ) , nums . get ( i + 1 ) ) ) ; nums . remove ( i + 1 ) ; current_ops . remove ( i ) ; } i -- ; } i = 0 ; while ( i < current_ops . size ( ) ) { if ( current_ops . get ( i ) . equals ( "*" ) ) { nums . set ( i , nums . get ( i ) * nums . get ( i + 1 ) ) ; nums . remove ( i + 1 ) ; current_ops . remove ( i ) ; } else if ( current_ops . get ( i ) . equals ( "//" ) ) { nums . set ( i , nums . get ( i ) / nums . get ( i + 1 ) ) ; nums . remove ( i + 1 ) ; current_ops . remove ( i ) ; } else { i ++ ; } } i = 0 ; while ( i < current_ops . size ( ) ) { if ( current_ops . get ( i ) . equals ( "+" ) ) { nums . set ( i , nums . get ( i ) + nums . get ( i + 1 ) ) ; nums . remove ( i + 1 ) ; current_ops . remove ( i ) ; } else if ( current_ops . get ( i ) . equals ( "-" ) ) { nums . set ( i , nums . get ( i ) - nums . get ( i + 1 ) ) ; nums . remove ( i + 1 ) ; current_ops . remove ( i ) ; } else { i ++ ; } } return nums . get ( 0 ) ; } 
ArrayList < Integer > GenerateIntegers ( int a , int b ) { int lower = Math . max ( 2 , Math . min ( a , b ) ) ; int upper = Math . min ( 8 , Math . max ( a , b ) ) ; ArrayList < Integer > result = new ArrayList < Integer > ( ) ; for ( int i = lower ; i <= upper ; i += 2 ) { result . add ( i ) ; } return result ; } 
boolean isStepNum ( int n ) { int prev_digit = - 1 ; while ( n > 0 ) { int cur_digit = n % 10 ; if ( prev_digit == - 1 ) { prev_digit = cur_digit ; } else { if ( Math . abs ( prev_digit - cur_digit ) != 1 ) { return false ; } } prev_digit = cur_digit ; n /= 10 ; } return true ; } 
int numOfWays ( int n , int k ) { int p = 1 ; if ( k % 2 != 0 ) { p = - 1 ; } return ( int ) ( Math . pow ( n - 1 , k ) + p * ( n - 1 ) ) / n ; } 
import java . util . * ; 
int EggDrop ( int n , int k ) { if ( k == 1 || k == 0 ) { return k ; } if ( n == 1 ) { return k ; } int min = Integer . MAX_VALUE ; for ( int x = 1 ; x <= k ; x ++ ) { int res = Math . max ( EggDrop ( n - 1 , x - 1 ) , EggDrop ( n , k - x ) ) ; if ( res < min ) { min = res ; } } return min + 1 ; } 
boolean isPowerOfTwo ( int n ) { if ( n == 0 ) { return false ; } return Math . ceil ( Math . log ( n ) / Math . log ( 2 ) ) == Math . floor ( Math . log ( n ) / Math . log ( 2 ) ) ; } 
String shortestPalindrome ( String s ) { int n = s . length ( ) ; List < String > v = new ArrayList < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { int l = i ; int r = i ; String ans1 = "" ; String ans2 = "" ; while ( l >= 0 && r < n && s . charAt ( l ) == s . charAt ( r ) ) { ans1 += s . charAt ( l ) ; l -- ; r ++ ; } l = i - 1 ; r = i ; while ( l >= 0 && r < n && s . charAt ( l ) == s . charAt ( r ) ) { ans2 += s . charAt ( l ) ; l -- ; r ++ ; } v . add ( ans1 ) ; v . add ( ans2 ) ; } String ans = v . get ( 0 ) ; for ( int i = 0 ; i < v . size ( ) ; i ++ ) { if ( ! v . get ( i ) . equals ( "" ) ) { ans = ( ans . compareTo ( v . get ( i ) ) < 0 ) ? ans : v . get ( i ) ; } } return ans ; } 
int minimumAdjacentDifference ( ArrayList < Integer > a , int n , int k ) { int min_diff = Integer . MAX_VALUE ; for ( int i = 0 ; i <= k ; i ++ ) { int max_diff = Integer . MIN_VALUE ; for ( int j = 0 ; j < n - k - 1 ; j ++ ) { for ( int p = i ; p <= i + j ; p ++ ) { max_diff = Math . max ( max_diff , a . get ( p + 1 ) - a . get ( p ) ) ; } } min_diff = Math . min ( min_diff , max_diff ) ; } return min_diff ; } 
int Cal ( List < Integer > a , int mid ) { int chocolate = 0 ; for ( int i : a ) { if ( i >= mid ) { chocolate += i - mid ; } } return chocolate ; } 
boolean check ( int v , List < Integer > a , int m ) { int tec = 0 , ans = 0 ; List < Integer > b = new ArrayList < Integer > ( a . size ( ) + 3 ) ; for ( int i = 0 ; i < a . size ( ) ; i ++ ) { tec -= b . get ( i ) ; if ( a . get ( i ) + tec < v ) { int mov = v - a . get ( i ) - tec ; ans = ans + mov ; tec += mov ; b . add ( i + 2 , mov ) ; } } return ans <= m ; } 
int largestNum ( ArrayList < Integer > arr ) { int res = 0 ; Collections . sort ( arr ) ; int l = 0 , r = arr . size ( ) - 1 ; while ( l < r ) { int sum = arr . get ( l ) + arr . get ( r ) ; if ( sum == 0 ) { res = Math . max ( res , Math . max ( arr . get ( l ) , arr . get ( r ) ) ) ; return res ; } else if ( sum < 0 ) { l ++ ; } else { r -- ; } } return res ; } 
int binarySearch ( ArrayList < Integer > p , int n ) { int i = 0 ; int j = p . size ( ) - 1 ; int index = - 1 ; while ( i <= j ) { int mid = i + ( j - i ) / 2 ; if ( p . get ( mid ) >= n ) { index = mid ; j = mid - 1 ; } else { i = mid + 1 ; } } return index ; } 
int FindMinLength ( ArrayList < Integer > arr ) { int index = arr . size ( ) - 1 ; while ( index > 0 && arr . get ( index ) >= arr . get ( index - 1 ) ) { index -- ; } return index ; } 
int minDigits ( int n , int k ) { int digits_num = ( int ) Math . floor ( Math . log10 ( n ) + 1 ) ; int temp_sum = 0 ; int temp = digits_num ; int result = 0 ; int x , v ; int sum = 0 ; int num2 = n ; while ( num2 != 0 ) { sum += num2 % 10 ; num2 /= 10 ; } if ( sum <= k ) { x = 0 ; } else { while ( temp > 0 ) { v = n / ( int ) Math . pow ( 10 , temp - 1 ) ; temp_sum += v % 10 ; if ( temp_sum >= k ) { v /= 10 ; v ++ ; result = v * ( int ) Math . pow ( 10 , temp ) ; break ; } temp -- ; } x = result - n ; return x ; } return - 1 ; } 
int CheckForPerfectSquare ( ArrayList < Integer > arr , int i , int j ) { int mid , sum = 0 ; for ( int m = i ; m <= j ; m ++ ) { sum += arr . get ( m ) ; } int low = 0 , high = sum / 2 ; while ( low <= high ) { mid = low + ( high - low ) / 2 ; if ( mid * mid == sum ) { return mid ; } else if ( mid * mid > sum ) { high = mid - 1 ; } else { low = mid + 1 ; } } return - 1 ; } 
int MinFlips ( ArrayList < ArrayList < Integer > > mat , String s ) { int n = mat . size ( ) ; int m = mat . get ( 0 ) . size ( ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < m ; j ++ ) { if ( mat . get ( i ) . get ( j ) != Character . getNumericValue ( s . charAt ( i + j ) ) ) { count ++ ; } } } return count ; } 
List < List < Integer > > constructTree ( int n , List < List < Integer > > edges ) { List < List < Integer > > adjl = new ArrayList < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { adjl . add ( new ArrayList < Integer > ( ) ) ; } for ( List < Integer > e : edges ) { int u = e . get ( 0 ) ; int v = e . get ( 1 ) ; adjl . get ( u ) . add ( v ) ; adjl . get ( v ) . add ( u ) ; } return adjl ; } 
int FindSumOfValues ( int v , List < Integer > parent , List < Integer > values_children ) { int cur_node = v ; int sum = 0 ; while ( cur_node != - 1 ) { sum += values_children . get ( cur_node ) ; cur_node = parent . get ( cur_node ) ; } return sum ; } 
int getDistinct ( int d , int count ) { int num = 0 ; count = ( int ) Math . pow ( 10 , count - 1 ) ; while ( count > 0 ) { num += count * d ; count /= 10 ; } return num ; } 
boolean isIncreasing ( ArrayList < Integer > arr ) { for ( int i = 0 ; i < arr . size ( ) - 1 ; i ++ ) { if ( arr . get ( i ) > arr . get ( i + 1 ) ) { return false ; } } return true ; } 
int MinAdjSwaps ( int [ ] [ ] mat ) { int n = mat . length ; int [ ] cnt_zero = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = n - 1 ; j >= 0 && mat [ i ] [ j ] == 0 ; j -- ) { cnt_zero [ i ] ++ ; } } int cnt_swaps = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( cnt_zero [ i ] < ( n - i - 1 ) ) { int first = i ; while ( first < n && cnt_zero [ first ] < ( n - i - 1 ) ) { first ++ ; } if ( first == n ) { return - 1 ; } while ( first > i ) { int temp = cnt_zero [ first ] ; cnt_zero [ first ] = cnt_zero [ first - 1 ] ; cnt_zero [ first - 1 ] = temp ; first -- ; cnt_swaps ++ ; } } } return cnt_swaps ; } 
int Solve ( List < Integer > values , List < Integer > salary , int mod ) { int ret = 1 ; int amt = 0 ; Collections . sort ( values ) ; Collections . sort ( salary ) ; while ( salary . size ( ) > 0 ) { while ( values . size ( ) > 0 && values . get ( values . size ( ) - 1 ) >= salary . get ( salary . size ( ) - 1 ) ) { amt ++ ; values . remove ( values . size ( ) - 1 ) ; } if ( amt == 0 ) { return 0 ; } ret *= amt -- ; ret %= mod ; salary . remove ( salary . size ( ) - 1 ) ; } return ret ; } 
List < Integer > OrganizeInOrder ( List < Integer > vec , List < Character > op , int n ) { List < Integer > result = new ArrayList < > ( n ) ; Collections . sort ( vec ) ; int i = 0 , j = n - 1 , k = 0 ; while ( i <= j && k <= n - 2 ) { if ( op . get ( k ) == '<' ) { result . set ( k , vec . get ( i ++ ) ) ; } else { result . set ( k , vec . get ( j -- ) ) ; } k ++ ; } result . set ( n - 1 , vec . get ( i ) ) ; return result ; } 
int CountPoints ( int n , int m , ArrayList < Integer > a , ArrayList < Integer > b , int x , int y ) { Collections . sort ( a ) ; Collections . sort ( b ) ; int j = 0 ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { while ( j < m ) { if ( a . get ( i ) + y < b . get ( j ) ) { break ; } if ( b . get ( j ) >= a . get ( i ) - x && b . get ( j ) <= a . get ( i ) + y ) { count ++ ; j ++ ; break ; } else { j ++ ; } } } return count ; } 
boolean areSame ( ArrayList < Integer > a , ArrayList < Integer > b ) { Collections . sort ( a ) ; Collections . sort ( b ) ; return a . equals ( b ) ; } 
int CountNumberOfStrings ( String s ) { int n = s . length ( ) - 1 ; int count = ( int ) Math . pow ( 2 , n ) ; return count ; } 
ArrayList < Integer > PrimePower ( int x ) { ArrayList < Integer > prime_pow = new ArrayList < Integer > ( ) ; for ( int i = 2 ; i * i <= x ; i ++ ) { if ( x % i == 0 ) { int p = 1 ; while ( x % i == 0 ) { x /= i ; p *= i ; } prime_pow . add ( p ) ; } } if ( x > 1 ) { prime_pow . add ( x ) ; } return prime_pow ; } 
boolean isPerfect ( int n0 ) { double n = Math . sqrt ( n0 ) ; if ( Math . floor ( n ) != Math . ceil ( n ) ) { return false ; } return true ; } 
int FindSum ( int l , int r ) { ArrayList < Integer > arr = new ArrayList < Integer > ( ) ; int i = 0 ; int x = 2 ; while ( i <= r ) { arr . add ( i + x ) ; if ( i + 1 <= r ) { arr . add ( i + 1 + x ) ; } x *= - 1 ; i += 2 ; } int sum = 0 ; for ( i = l ; i <= r ; ++ i ) { sum += arr . get ( i ) ; } return sum ; } 
int Results ( int n , int k ) { return Math . round ( ( float ) Math . pow ( n , 1.0 / Math . pow ( 2 , k ) ) ) ; } 
List < Integer > factors ( int n ) { List < Integer > v = new ArrayList < > ( ) ; v . add ( 1 ) ; for ( int i = 2 ; i <= Math . sqrt ( n ) ; i ++ ) { if ( n % i == 0 ) { v . add ( i ) ; if ( n / i != i ) { v . add ( n / i ) ; } } } return v ; } 
int SmallestNum ( int n ) { double x = Math . pow ( 10.0 , ( n - 1 ) / 2.0 ) ; return ( int ) Math . ceil ( x ) ; } 
int smallest ( String s ) { List < Integer > a = new ArrayList < > ( s . length ( ) ) ; for ( int i = 0 ; i < s . length ( ) ; i ++ ) { a . add ( Integer . parseInt ( String . valueOf ( s . charAt ( i ) ) ) ) ; } List < Integer > b = new ArrayList < > ( ) ; for ( int i = 0 ; i < a . size ( ) ; i ++ ) { if ( a . get ( i ) % 2 != 0 ) { b . add ( a . get ( i ) ) ; } } Collections . sort ( b ) ; if ( b . size ( ) > 1 ) { return b . get ( 0 ) * 10 + b . get ( 1 ) ; } return - 1 ; } 
import java . util . ArrayList ; 
int findNumberOfDigits ( int n , int bas ) { int dig = ( int ) ( Math . floor ( Math . log ( n ) / Math . log ( bas ) ) + 1 ) ; return dig ; } 
double NGon ( int n ) { double pro_angle_var ; if ( n % 4 == 0 ) { pro_angle_var = Math . PI * ( 180.0 / n ) / 180 ; } else { pro_angle_var = Math . PI * ( 180.0 / ( 2 * n ) ) / 180 ; } double neg_x = 1.0e+99 , pos_x = - 1.0e+99 , neg_y = 1.0e+99 , pos_y = - 1.0e+99 ; for ( int j = 0 ; j < n ; ++ j ) { double px = Math . cos ( 2 * Math . PI * j / n + pro_angle_var ) ; double py = Math . sin ( 2 * Math . PI * j / n + pro_angle_var ) ; neg_x = Math . min ( neg_x , px ) ; pos_x = Math . max ( pos_x , px ) ; neg_y = Math . min ( neg_y , py ) ; pos_y = Math . max ( pos_y , py ) ; } double opt2 = Math . max ( pos_x - neg_x , pos_y - neg_y ) ; return opt2 / Math . sin ( Math . PI / n ) / 2 ; } 
int FindMaxK ( int n ) { int p = ( int ) ( Math . log ( n ) / Math . log ( 2 ) ) ; return ( int ) Math . pow ( 2 , p ) ; } 
int NthFibo ( int n ) { double a = ( Math . pow ( 5 , 0.5 ) + 1 ) / 2 ; double b = ( - 1 * Math . pow ( 5 , 0.5 ) + 1 ) / 2 ; double r = Math . pow ( 5 , 0.5 ) ; double ans = ( Math . pow ( a , n ) - Math . pow ( b , n ) ) / r ; return ( int ) ans ; } 
double findProb ( int l , int r ) { double count_of_ps = Math . floor ( Math . sqrt ( r ) ) - Math . ceil ( Math . sqrt ( l ) ) + 1 ; double total = r - l + 1 ; double prob = count_of_ps / total ; return prob ; } 
int previousFibonacci ( int n ) { double a = n / ( ( 1 + Math . sqrt ( 5 ) ) / 2.0 ) ; return Math . round ( ( float ) a ) ; } 
ArrayList < Integer > DistPrime ( ArrayList < Integer > arr , ArrayList < Integer > all_primes ) { ArrayList < Integer > list1 = new ArrayList < > ( ) ; for ( int i : all_primes ) { for ( int j : arr ) { if ( j % i == 0 ) { list1 . add ( i ) ; break ; } } } return list1 ; } 
import java . util . * ; 
int MaximumLength ( List < Integer > a ) { List < Integer > counts = new ArrayList < > ( Collections . nCopies ( 11 , 0 ) ) ; int ans = 0 ; for ( int index = 0 ; index < a . size ( ) ; index ++ ) { counts . set ( a . get ( index ) , counts . get ( a . get ( index ) ) + 1 ) ; List < Integer > k = new ArrayList < > ( ) ; for ( int i : counts ) { if ( i != 0 ) { k . add ( i ) ; } } Collections . sort ( k ) ; if ( k . size ( ) == 1 || ( k . get ( 0 ) == k . get ( k . size ( ) - 2 ) && k . get ( k . size ( ) - 1 ) - k . get ( k . size ( ) - 2 ) == 1 ) || ( k . get ( 0 ) == 1 && k . get ( 1 ) == k . get ( k . size ( ) - 1 ) ) ) { ans = index ; } } return ans + 1 ; } 
int maxEdges ( int n ) { int edges = ( int ) Math . floor ( n * n / 4 ) ; return edges ; } 
int findK ( int n , int k ) { ArrayList < Integer > a = new ArrayList < > ( ) ; for ( int i = 1 ; i < n ; i ++ ) { if ( i % 2 == 1 ) { a . add ( i ) ; } } for ( int i = 1 ; i < n ; i ++ ) { if ( i % 2 == 0 ) { a . add ( i ) ; } } return a . get ( k - 1 ) ; } 
boolean isKeith ( int x , int temp ) { List < Integer > terms = new ArrayList < > ( ) ; int n = 0 ; while ( temp > 0 ) { terms . add ( temp % 10 ) ; temp = temp / 10 ; n ++ ; } Collections . reverse ( terms ) ; int next_term = 0 , i = n ; while ( next_term < x ) { next_term = 0 ; for ( int j = 1 ; j <= n ; j ++ ) { next_term += terms . get ( i - j ) ; } terms . add ( next_term ) ; i ++ ; } return next_term == x ; } 
boolean Factors ( int n , int k ) { Vector < Integer > v = new Vector < > ( ) ; while ( n % 2 == 0 ) { v . add ( 2 ) ; n /= 2 ; } if ( v . size ( ) >= k ) { return true ; } for ( int i = 3 ; i * i <= n ; i += 2 ) { while ( n % i == 0 ) { n = n / i ; v . add ( i ) ; } if ( v . size ( ) >= k ) { return true ; } } if ( n > 2 ) { v . add ( n ) ; } if ( v . size ( ) >= k ) { return true ; } return false ; } 
