1.
```
Conjecture: Given a binary tree T with n nodes, the number of degree-2 nodes is one less than the number of leaf nodes.

Proof(Induction):
    Basis step:
        Given a tree T with 3 nodes such that the tree looks like:
          X
         / \
        X   X
        By inspection there are 1 degree-2 nodes and 2 leaf nodes. Note there is one less degree-2 node than leaf nodes.

        By the conjecture, given the 2 leaf nodes:
        2 - 1 = 1 degree-2 nodes, which is truee.

        Basis step holds.
    
    Inductive step:
        IH: Assume a binary tree T with n nodes will have one less degree-2 nodes than there are leaf nodes, then a binary tree T' with n + 1 nodes will also have one less degree-2 nodes than there are leaf nodes.

        Let T have N degree-2 nodes and L lead nodes, where N and L are integers greater than or equal to 0 and N = L - 1.

        Note there are two cases.

        First, adding the node to a leaf node:
        This means a leaf node becomes a degree-1 node and we gain a leaf node.
        So N = L - 1 - 1 + 1 => N = L - 1 which is unchanged.

        Second, adding the node to a degree-1 node:
        This means the degree-1 node becomes a degree-2 node and we gain a leaf node.
        So N + 1 = L - 1 + 1 => N = L - 1 which is unchanged.

        Since in both cases the number of degree-2 nodes was always one less than then number of lead nodes, the inductive step holds.
    
    Conclusion:
    Because the basis and inductive step both hold, the conjecture holds true. QED
```
