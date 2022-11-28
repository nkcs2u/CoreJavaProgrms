package NaveenAutomationLabs;

public class MemoryManagement {
    /*
    Java memory:
      1. Heap
      2. stack

      Heap:
        1. part-01: young gen
        2. part-02: old gen

        young-gen hidden:
        . first time when create object will come here.
        . when hidden memory completely filled, garbage collector mechanism will be called. Minor gc().
        . gc() will shift some objects to s-01/s-02
        . garbage collector will clear the objects which has no reference
        . when memory is full in hidden to s-01 and s-02
        young-gen survivor 01:

        young-gen survivor 02:

        ====
        Old gen:
        . when s-01 and s-02 also filled up. Old gen will come with major gc()
        . major gc() takes lot of time, lot of memory in screening/change

        -----------------------------

        permanent gen :
        . application metadata classes, program files , methods etc.
        . not part of heap memory
        . generated at run time
        permanent-gen : method area:
            complete method structure
            constant and static variable
            ---------------------------------------

            Memory pool:
            . memory pool is used to store immutable objects : String
            . decides on runtime

            runtime constant pool:
                . part of permanent-gen method area
                used to store static and constant variables
                ---------------------------

                Java heap:
                    stores class objects
                    gc() runs on heap memory also
                    to free some memory destroying some objects which dont have reference
                    ======================================================================
                    =====================================================================


         Stack memory:
            used for execution of threads
            contains method specific values
            reference of objects
            refernce will poining to objects
            stack works as LIFO, recent will be at top
            method: m1() will be stored with stack. provides method block
            stack memory is less in size
     */
}
