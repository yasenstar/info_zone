# Java Method: `findWithinHorizon`

Let's examine how `findWithinHorizon(".", 0)` works.

Java's `findWidthHorizon` method looks for things in the input. The things the method finds depend on the stuff you put in parentheses.

For example, a call to `findWithinHorizon("\\d\\d\\d", 0)` looks for a group consisting of three digits. With the following line of code:

```java
System.out.println(keyboard.findWithinHorizon("\\d\\d\\d", 0));
```

I can type `Testing 123 Testing Testing`, and the computer responds by displaying `123`.

In the call `findwithinHorizon("\\d\\d\\d", 0)` each `\\d` stands for a single digit. The `\\d` business is one of many abbreviations in special code called _`regular expressions`_.

Now here's something strange, in the world of regular expressions, a `dot` stands for any character at all. (That is, a `dot` stands for "any character, not necessarilly a `dot`.") So `findWithinHorizon(".", 0)` tells the computer to find the next character of any kind that the user types on the keyboard. When you're trying to input a single character, `findWithinHorizon(".", 0)` is mighty useful.

In the call `findwithinHorizon("\\d\\d\\d", 0)`, the `0` tells `findwithinHorizon` to keep searching until the end of the input. This value `0` is a special case because anything other than `0` limits the search to a certain number of character. (That's why the method name contains the word _`horizon`_. The _`horizon`_ is as far as the method sees.)

Here are a few examples:

- With the same input `Testing 123 Testing Testing1`, the call `findWithinHorizon("\\d\\d\\d", 9)` returns `null`. It returns `null` because the first nine characters of the input (the characters `Testing 1` - seven letters, a blank space, and a digit) don't contain three consecutive digits. These nine characters don't match the pattern `\\d\\d\\d`.

- With the same input, the call `findWithinHorizon("\\d\\d\\d", 10)` also returns `null`. It returns `null` because the first ten characters of the input (the characters `Testing 12`) don't contain three consecutive digits.

- With the same input, the call `findWithinHorizon("\\d\\d\\d", 11)` returns `123`. It returns `123` because the first 11 characters of the input (the characters `Testing 123`) contain these three condecutive digits.

- With the input `A57B442123 Testing`, the call `findWithinHorizon("\\d\\d\\d", 12)` returns `442`. It returns `442` because, among the first 12 characters of the input (the characters `A57B442123 T`), the first sequence consisting of three consecutive digits is the sequence `442`.

But wait! To grab a single character from the keyboard, I call `findWithinHorizon(".", 0).charAt(0)`. Whats the role of `charAt(0)` in reading a single character? Unfortunately, any `findWithinHorizon` call behaves as though it's finding a bunch of characters, not just a single character. Even when you call `findwithinHorizon(".", 0)`, and the computer fetches jut one letter from the keyboard, the Java program treats that letter as one of the possibly many input characters.

The call to `charAt(0)` takes care of the multicharacter problem. This `charAt(0)` call tells Java to pick the initial character from any of the characters that `findWithinHorizon` fetches.



_-- Berry Burd, Beginning Programming with Java for Dummies, 5th Edition_