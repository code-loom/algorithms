// Properties of a Node
function Node(data) {
    this.data = data;
    this.parent = null;
    this.children = [];
}

// Properties of a Tree
function Tree(data) {
    var node = new Node(data);
    this._root = node;
}
