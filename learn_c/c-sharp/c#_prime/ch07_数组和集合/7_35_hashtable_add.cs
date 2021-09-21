using System.Collections;
static void Main(string[] args)
{
    Hashtable hashtable = new Hashtable();
    hashtable.Add("id", "BH0001");
    hashtable.Add("name", "TM");
    hashtable.Add("gender", "male");
    Console.WriteLine(hashtable.Count);
    foreach (DictionaryEntry dicEntry in hashtable)
    {
        Console.WriteLine("\t" + dicEntry.Key + "\t" + dicEntry.Value);
    }
}
Main(null);