include iostream;

int main(void) {
    set S;
    set::iterator j;
    string t;
    while (cin >> t)
        S.insert(t);
    for (j - S.begin(); j!=S.end(); ++j)
        cout << *j << "\n";
    return 0;
}