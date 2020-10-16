/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerina.toml.syntax.tree;

import io.ballerina.toml.internal.parser.tree.STNode;

import java.util.Objects;

/**
 * This is a generated syntax tree node.
 *
 * @since 2.0.0
 */
public class BoolLiteralNode extends ValueNode {

    public BoolLiteralNode(STNode internalNode, int position, NonTerminalNode parent) {
        super(internalNode, position, parent);
    }

    public Token value() {
        return childInBucket(0);
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T apply(NodeTransformer<T> visitor) {
        return visitor.transform(this);
    }

    @Override
    protected String[] childNames() {
        return new String[]{
                "value"};
    }

    public BoolLiteralNode modify(
            Token value) {
        if (checkForReferenceEquality(
                value)) {
            return this;
        }

        return NodeFactory.createBoolLiteralNode(
                value);
    }

    public BoolLiteralNodeModifier modify() {
        return new BoolLiteralNodeModifier(this);
    }

    /**
     * This is a generated tree node modifier utility.
     *
     * @since 2.0.0
     */
    public static class BoolLiteralNodeModifier {
        private final BoolLiteralNode oldNode;
        private Token value;

        public BoolLiteralNodeModifier(BoolLiteralNode oldNode) {
            this.oldNode = oldNode;
            this.value = oldNode.value();
        }

        public BoolLiteralNodeModifier withValue(
                Token value) {
            Objects.requireNonNull(value, "value must not be null");
            this.value = value;
            return this;
        }

        public BoolLiteralNode apply() {
            return oldNode.modify(
                    value);
        }
    }
}
