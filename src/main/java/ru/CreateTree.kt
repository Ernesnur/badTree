package ru

import kotlin.random.Random


fun createTree(): Client {
    return Client().create().createBranches(1)
}

fun Client.createBranches(count: Int): Client {
    if (count > 0) {
        this.children = listOf(this.createBranches(count - 1).createBranch())
    }
    return this
}

/**
 * It'll ru.create branch with the structure:
 *           (1)
 *           / \
 *         (2) (2)
 */
fun Client.createBranch(): Client {
        return this.also { it.children = this.createChildren() }
}

/**
 * It'll create branch with the structure:
 *        (2)  (2)
 */
fun Client.createChildren(): List<Client> {
    val list = ArrayList<Client>()
    for (i in 1..2) {
        list.add(Client().create())
    }
    return list
}

fun Client.create(): Client {
    return Client(
            id = "" + Random.nextInt(999999)
    )
}