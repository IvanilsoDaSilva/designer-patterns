package org.example.duckturkey

fun testDuck(duck: DuckInterface) {
    duck.quack();
    duck.fly();
}

fun testTurkey(turkey: TurkeyInterface){
    turkey.gobble();
    turkey.fly();
}

fun main() {
    val duck: Duck = Duck();
    val turkey: Turkey = Turkey();

    //The duck1 does:
    testDuck(duck);

    //The turkey does:
    testTurkey(turkey);

    //The turkey adapted a does:
    testDuck(TurkeyAdapter(turkey));
}