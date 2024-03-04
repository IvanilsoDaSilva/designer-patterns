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

    //O pato faz:
    testDuck(duck);

    //O peru faz:
    testTurkey(turkey);

    //O peru adaptado faz
    testDuck(TurkeyAdapter(turkey));
}