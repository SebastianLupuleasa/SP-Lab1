public interface Element {

        void render();
        void add(Element e);
        void remove(Element e);
        Element get(int index);
        void accept(Visitor visitor);
}
